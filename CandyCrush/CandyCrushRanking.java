package CandyCrush;

import java.util.*;

public class CandyCrushRanking {
    private static CandyCrushRanking instance = null;
    private TreeMap<Integer, Set<String>> scores;
    private Map<String, Integer> playerScores;

    // Constructor is private to prevent instantiation from outside
    private CandyCrushRanking() {
        scores = new TreeMap<>(Collections.reverseOrder());
        playerScores = new HashMap<>();
    }

    // Static method to get the single instance of the class
    public static synchronized CandyCrushRanking getInstance() {
        if (instance == null) {
            instance = new CandyCrushRanking();
        }
        return instance;
    }

    // Method to add or update a player's score
    public void addScore(String player, int score) {
        if (playerScores.containsKey(player)) {
            int oldScore = playerScores.get(player);
            scores.get(oldScore).remove(player);
            if (scores.get(oldScore).isEmpty()) {
                scores.remove(oldScore);
            }
        }

        playerScores.put(player, score);
        scores.computeIfAbsent(score, k -> new HashSet<>()).add(player);
    }

    // Method to remove a player's score
    public void removeScore(String player) {
        if (playerScores.containsKey(player)) {
            int oldScore = playerScores.remove(player);
            scores.get(oldScore).remove(player);
            if (scores.get(oldScore).isEmpty()) {
                scores.remove(oldScore);
            }
        }
    }

    // Method to get the player with the highest score
    public String getWinner() {
        if (scores.isEmpty()) {
            return null;
        }
        return scores.firstEntry().getValue().iterator().next();
    }

    // Method to get the player with the lowest score
    public String getLoser() {
        if (scores.isEmpty()) {
            return null;
        }
        return scores.lastEntry().getValue().iterator().next();
    }

    // Method to get the ranking map
    public Map<String, Integer> getRanking() {
        Map<String, Integer> ranking = new LinkedHashMap<>();
        scores.forEach((score, players) -> {
            players.forEach(player -> ranking.put(player, score));
        });
        return ranking;
    }

    public static void main(String[] args) {
        // Testing the Singleton pattern
        CandyCrushRanking ranking1 = CandyCrushRanking.getInstance();
        System.out.println("Premier appel à Instance() singleton: " + ranking1);

        ranking1.addScore("bibi", 300);
        ranking1.addScore("pepette", 234);
        ranking1.addScore("boulboul", 209);
        ranking1.addScore("safinette", 202);
        ranking1.addScore("skymed", 177);
        ranking1.addScore("choupette", 78);
        ranking1.addScore("mimi", 50);

        System.out.println("🍓Le gagnant est: " + ranking1.getWinner());
        System.out.println("🍉Le perdant est: " + ranking1.getLoser());

        System.out.println("🍇🍇🍇🍇🍇Classement 1🍇🍇🍇🍇🍇");
        ranking1.getRanking().forEach((player, score) -> {
            System.out.println(player + " a obtenu " + score + " points");
        });

        // Adding a new score
        ranking1.addScore("momo", 90);

        // Getting the instance again to show that it remains the same
        CandyCrushRanking ranking2 = CandyCrushRanking.getInstance();
        System.out.println("Deuxième appel à Instance() singleton: " + ranking2);

        System.out.println("🍓Le gagnant est: " + ranking2.getWinner());
        System.out.println("🍉Le perdant est: " + ranking2.getLoser());

        System.out.println("🍇🍇🍇🍇🍇Classement 2🍇🍇🍇🍇🍇");
        ranking2.getRanking().forEach((player, score) -> {
            System.out.println(player + " a obtenu " + score + " points");
        });
    }
}
