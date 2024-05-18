package Prototype;
import java.util.Random;

public class CollaborativeAgent extends IntelligentAgent {
    private static final String[] CONTRIBUTORS = {"Dionysos", "Biquette", "Hercule", "Achille", "Ulysse", "Ajax", "Hector", "Paris", "Agamemnon", "Ménélas"};

    @Override
    public CollaborativeAgent duplicate() {
        try {
            return (CollaborativeAgent) this.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public String processRequest(String request) {
        Random rand = new Random();
        StringBuilder response = new StringBuilder("Dionysos et Biquette ont participé à l'élaboration de la réponse");
        String contributor1 = CONTRIBUTORS[rand.nextInt(CONTRIBUTORS.length)];
        String contributor2;
        do {
            contributor2 = CONTRIBUTORS[rand.nextInt(CONTRIBUTORS.length)];
        } while (contributor1.equals(contributor2));
        response = new StringBuilder(contributor1 + " et " + contributor2 + " ont participé à l'élaboration de la réponse");
        return response.toString();
    }
}
