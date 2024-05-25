package BigData;

import java.util.Arrays;
import java.util.List;


// Algorithme de partitionnement en K-moyennes
class KMeansPartitioning implements DataProcessing {
    @Override
    public List<String> process(List<Data> data) {
        // Algorithme fictif de partitionnement en K-moyennes
        // Renvoie uniquement les CVs contenant le mot "informatique" dans leur contenu
        return data.stream()
                .filter(d -> d.getContent().contains("informatique"))
                .map(Data::getContent)
                .toList();
    }
}
