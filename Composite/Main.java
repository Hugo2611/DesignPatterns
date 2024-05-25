package Composite;


public class Main {
    public static void main(String[] args) {
        // Create files
        File holidays = new File("holidays.mov", 120);
        File titanic = new File("titanic.mov", 57);

        File thriller = new File("thriller.mp3", 30);
        File rockWithYou = new File("rockWithYou.mp3", 40);
        File youAreNotAlone = new File("youAreNotAlone.mp3", 50);
        File bad = new File("bad.mp3", 60);
        File billieJean = new File("billieJean.mp3", 160);

        File flower = new File("flower.jpg", 50);
        File landscape = new File("landscape.gif", 70);
        File doll = new File("doll.png", 100);
        File toy = new File("toy.jpg", 40);
        File teddyBear = new File("teddyBear.png", 80);
        File cake = new File("cake.jpg", 122);

        // Create directories
        Directory movies = new Directory("movies");
        Directory music = new Directory("music");
        Directory pictures = new Directory("pictures");

        Directory nature = new Directory("nature");
        Directory objects = new Directory("objects");
        Directory food = new Directory("food");

        // Build directory structure
        movies.add(holidays);
        movies.add(titanic);

        music.add(thriller);
        music.add(rockWithYou);
        music.add(youAreNotAlone);
        music.add(bad);
        music.add(billieJean);

        nature.add(flower);
        nature.add(landscape);

        objects.add(doll);
        objects.add(toy);

        food.add(teddyBear);
        food.add(cake);

        pictures.add(nature);
        pictures.add(objects);
        pictures.add(food);

        // Display the structure
        movies.display("");
        music.display("");
        pictures.display("");
    }
}
