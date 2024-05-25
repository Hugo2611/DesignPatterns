package BigData;
import java.util.List;

// Interface pour le traitement des données
interface DataProcessing {
    List<String> process(List<Data> data);
}

// Classe représentant les données des CVs
class Data {
    private String format;
    private String content;

    public Data(String format, String content) {
        this.format = format;
        this.content = content;
    }

    public String getFormat() {
        return format;
    }

    public String getContent() {
        return content;
    }
}
