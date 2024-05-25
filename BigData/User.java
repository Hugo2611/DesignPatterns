package BigData;
import java.util.Arrays;
import java.util.List;

public class User {
    public static void main(String[] args) {
        List<Data> datas = Arrays.asList(
                new Data("Text", "CV 1 technicien informatique"),
                new Data("PDF", "CV 2 ingénieur études et développement"),
                new Data("Word", "CV 3 testeur logiciel"),
                new Data("PDF", "CV 4 chercheur en biologie"),
                new Data("Text", "CV 5 responsable d'application")
        );

        RecruitmentView recruitmentView = new RecruitmentView(datas);

        // Application de l'algorithme de partitionnement en K-moyennes
        System.out.println("Application de l'algorithme de partitionnement en K-moyennes :");
        recruitmentView.process(new KMeansPartitioning());

        // Application de l'algorithme de régression linéaire
        System.out.println("Application de l'algorithme de régression linéaire :");
        recruitmentView.process(new LinearRegression());

        // Application de l'algorithme des arbres de classification
        System.out.println("Application de l'algorithme des arbres de classification :");
        recruitmentView.process(new ClassificationTree());
    }
}
