package Authentification;

public class DecoratorAPIKeys extends Decorator {
    public DecoratorAPIKeys(AuthenticationComponent component) {
        super(component);
    }

    @Override
    public boolean authenticate() {
        String apikey = this.generateAPIKey();
        System.out.println("API Key :" + apikey);
        return apikey != null && super.authenticate();
    }

    private String generateAPIKey() {
        // Simulate API key generation
        return "e88c562a7355c727f55c0a2ac6353ad8672704c56b672d98a3050f0f0633dfac";
    }
}
