package BigData;
import java.util.Arrays;
import java.util.List;

// Algorithme de régression linéaire
class LinearRegression implements DataProcessing {
    @Override
    public List<String> process(List<Data> data) {
        // Algorithme fictif de régression linéaire
        // Renvoie uniquement le contenu des CVs 1 et 5
        return Arrays.asList(data.get(0).getContent(), data.get(4).getContent());
    }
}

