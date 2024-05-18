package Prototype;

public class InformationAgent extends IntelligentAgent {
    private static final String[] SOURCES = {
            "https://www.imagescreations.fr/",
            "https://fr.wikipedia.org/wiki/Agent_intelligent",
            "https://datascientest.com/intelligence-artificielle-definition",
            "https://www.netapp.com/fr/artificial-intelligence/what-is-artificial-intelligence/",
            "https://www.talend.com/fr/resources/what-is-artificial-intelligence"
    };

    @Override
    public InformationAgent duplicate() {
        try {
            return (InformationAgent) this.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public String processRequest(String request) {
        StringBuilder response = new StringBuilder("La requête " + request + " a été traitée à partir des sources suivantes: ");
        for (int i = 0; i < SOURCES.length; i++) {
            response.append("source").append(i + 1).append("=").append(SOURCES[i]);
            if (i < SOURCES.length - 1) {
                response.append(", ");
            }
        }
        return response.toString();
    }
}
