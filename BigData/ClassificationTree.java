package BigData;
import java.util.List;


// Algorithme des arbres de classification
class ClassificationTree implements DataProcessing {
    @Override
    public List<String> process(List<Data> data) {
        // Algorithme fictif des arbres de classification
        // Renvoie uniquement le contenu des CVs au format PDF
        return data.stream()
                .filter(d -> "PDF".equals(d.getFormat()))
                .map(Data::getContent)
                .toList();
    }
}

