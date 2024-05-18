package Authentification;
import java.util.regex.*;

public class BaseAuthent implements AuthenticationComponent {
    private User user;

    public BaseAuthent(User user) {
        this.user = user;
    }

    @Override
    public boolean authenticate() {
        String login = user.getLogin();
        String password = user.getPassword();

        if (login == null || login.length() < 8) {
            return false;
        }

        String passwordPattern = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*\\W).{8,}";
        Pattern pattern = Pattern.compile(passwordPattern);
        Matcher matcher = pattern.matcher(password);

        return matcher.matches();
    }
}
