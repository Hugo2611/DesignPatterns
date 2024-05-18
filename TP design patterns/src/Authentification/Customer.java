package Authentification;

public class Customer {
    public static void main(String[] args) {
        User user = new User("safgharb", "7safSAF,#");

        AuthenticationComponent baseAuth = new BaseAuthent(user);
        AuthenticationComponent authWithOAuth = new DecoratorOAuth(baseAuth);
        AuthenticationComponent authWithJWT = new DecoratorJWT(authWithOAuth);
        AuthenticationComponent authWithAPIKeys = new DecoratorAPIKeys(authWithJWT);

        if (authWithAPIKeys.authenticate()) {
            System.out.println("Tu es authentifié!");
        } else {
            System.out.println("Échec de l'authentification!");
        }
    }
}
