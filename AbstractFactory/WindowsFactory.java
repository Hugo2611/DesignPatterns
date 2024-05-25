package AbstractFactory;

import javax.swing.JButton;
import javax.swing.JMenu;

public class WindowsFactory implements GraphicComponentFactory {

    @Override
    public JButton createButton(String text) {
        WindowsButton button = new WindowsButton(text);
        return button.toSwingButton();
    }

    @Override
    public JMenu createMenu(String text) {
        WindowsMenu menu = new WindowsMenu(text);
        return menu.toSwingMenu();
    }
}
