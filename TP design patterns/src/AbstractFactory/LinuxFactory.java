package AbstractFactory;

import javax.swing.JButton;
import javax.swing.JMenu;

public class LinuxFactory implements GraphicComponentFactory {

    @Override
    public JButton createButton(String text) {
        LinuxButton button = new LinuxButton(text);
        return button.toSwingButton();
    }

    @Override
    public JMenu createMenu(String text) {
        LinuxMenu menu = new LinuxMenu(text);
        return menu.toSwingMenu();
    }
}
