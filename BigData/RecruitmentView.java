package BigData;
import java.util.List;


class RecruitmentView {
    private List<Data> datas;

    public RecruitmentView(List<Data> datas) {
        this.datas = datas;
    }

    public void process(DataProcessing processing) {
        List<String> relevantCVs = processing.process(datas);
        System.out.println("Résultats de l'algorithme : " + relevantCVs);
    }
}
