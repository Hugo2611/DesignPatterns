package AbstractFactory;

import javax.swing.*;
import java.util.Scanner;

public class Library {
    private GraphicComponentFactory factory;

    public Library(GraphicComponentFactory factory) {
        this.factory = factory;
    }

    public void createUI() {
        JFrame frame = new JFrame("Abstract Factory Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JButton button = factory.createButton("bouton " + factory.getClass().getSimpleName().replace("Factory", "") + " de Safinette");
        frame.getContentPane().add(button);

        JMenu menu = factory.createMenu("Menu Safinette");
        menu.add(new JMenuItem(factory.getClass().getSimpleName().replace("Factory", "") + " Menu item #1"));
        menu.add(new JMenuItem(factory.getClass().getSimpleName().replace("Factory", "") + " Menu item #2"));

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GraphicComponentFactory factory = null;

        while (factory == null) {
            System.out.println("Pour quel OS souhaitez-vous créer les éléments graphiques? (linux, mac, windows)");
            String os = scanner.nextLine().trim().toLowerCase();

            switch (os) {
                case "linux":
                    factory = new LinuxFactory();
                    break;
                case "mac":
                    factory = new MacFactory();
                    break;
                case "windows":
                    factory = new WindowsFactory();
                    break;
                default:
                    System.out.println("Le nom de l'OS n'est pas correct. Veuillez resaisir un OS.");
            }
        }

        Library library = new Library(factory);
        library.createUI();
    }
}
