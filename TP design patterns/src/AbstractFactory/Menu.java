package AbstractFactory;

import javax.swing.JMenu;

public abstract class Menu {
    protected String text;

    public Menu(String text) {
        this.text = text;
    }

    public abstract JMenu toSwingMenu();
}
