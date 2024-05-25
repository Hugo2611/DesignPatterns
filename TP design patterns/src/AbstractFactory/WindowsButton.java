package AbstractFactory;

import javax.swing.JButton;

public class WindowsButton extends Button {

    public WindowsButton(String text) {
        super(text);
    }

    @Override
    public JButton toSwingButton() {
        return new JButton(text);
    }
}
