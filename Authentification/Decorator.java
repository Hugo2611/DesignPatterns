package Authentification;

public abstract class Decorator implements AuthenticationComponent {
    protected AuthenticationComponent component;

    public Decorator(AuthenticationComponent component) {
        this.component = component;
    }

    @Override
    public boolean authenticate() {
        return component.authenticate();
    }
}
