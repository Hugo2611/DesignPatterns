package Authentification;

public class DecoratorJWT extends Decorator {
    public DecoratorJWT(AuthenticationComponent component) {
        super(component);
    }

    @Override
    public boolean authenticate() {
        String token = this.generateJSONToken();
        System.out.println("JWT Token :" + token);
        return token != null && token.contains("{") && super.authenticate();
    }

    private String generateJSONToken() {
        // Simulate JSON token generation
        return "{token:NvxkNXVVeocLpDg}";
    }
}
