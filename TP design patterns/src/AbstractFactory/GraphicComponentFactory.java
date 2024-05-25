package AbstractFactory;

import javax.swing.JButton;
import javax.swing.JMenu;

public interface GraphicComponentFactory {
    JButton createButton(String text);
    JMenu createMenu(String text);
}
