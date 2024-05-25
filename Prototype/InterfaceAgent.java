package Prototype;
import java.util.Random;

public class InterfaceAgent extends IntelligentAgent {
    private static final String[] COMPONENTS = {"Zone de mot de passe", "Bouton radio", "Case à cocher", "Champ de texte", "Liste déroulante", "Bouton", "Image", "Tableau", "Label", "Slider"};

    @Override
    public InterfaceAgent duplicate() {
        try {
            return (InterfaceAgent) this.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public String processRequest(String request) {
        Random rand = new Random();
        StringBuilder response = new StringBuilder("Les composants graphiques suivants ont été utilisés pour l'élaboration de la réponse: ");
        for (int i = 0; i < 3; i++) {
            response.append(COMPONENTS[rand.nextInt(COMPONENTS.length)]);
            if (i < 2) {
                response.append(", ");
            }
        }
        return response.toString();
    }
}
