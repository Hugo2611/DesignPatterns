package AbstractFactory;

import javax.swing.JButton;

public class MacButton extends Button {

    public MacButton(String text) {
        super(text);
    }

    @Override
    public JButton toSwingButton() {
        return new JButton(text);
    }
}
