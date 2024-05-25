package Authentification;

public class DecoratorOAuth extends Decorator {
    public DecoratorOAuth(AuthenticationComponent component) {
        super(component);
    }

    @Override
    public boolean authenticate() {
        String token = this.generateToken();
        System.out.println("OAuth Token :" + token);
        return token != null && super.authenticate();
    }

    private String generateToken() {
        // Simulate token generation
        return "kQhWFFmEOLePPZM";
    }
}
