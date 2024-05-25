package AbstractFactory;

import javax.swing.JButton;

public abstract class Button {
    protected String text;

    public Button(String text) {
        this.text = text;
    }

    public abstract JButton toSwingButton();
}
