package AbstractFactory;

import javax.swing.JButton;
import javax.swing.JMenu;

public class MacFactory implements GraphicComponentFactory {

    @Override
    public JButton createButton(String text) {
        MacButton button = new MacButton(text);
        return button.toSwingButton();
    }

    @Override
    public JMenu createMenu(String text) {
        MacMenu menu = new MacMenu(text);
        return menu.toSwingMenu();
    }
}
