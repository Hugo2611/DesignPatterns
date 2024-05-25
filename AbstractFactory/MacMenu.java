package AbstractFactory;

import javax.swing.JMenu;

public class MacMenu extends Menu {

    public MacMenu(String text) {
        super(text);
    }

    @Override
    public JMenu toSwingMenu() {
        return new JMenu(text);
    }
}
