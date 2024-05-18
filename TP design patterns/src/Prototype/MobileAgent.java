package Prototype;
import java.util.Random;

public class MobileAgent extends IntelligentAgent {
    private static final String[] COMPUTERS = {"Deep Thought", "HAL 9000", "Turing Machine", "ENIAC", "Watson", "AlphaGo", "Siri", "Alexa", "Cortana", "GPT-4"};

    @Override
    public MobileAgent duplicate() {
        try {
            return (MobileAgent) this.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public String processRequest(String request) {
        Random rand = new Random();
        String computer = COMPUTERS[rand.nextInt(COMPUTERS.length)];
        return "L'ordinateur \"" + computer + "\" a traité votre requête: " + request;
    }
}
