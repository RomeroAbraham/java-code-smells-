class UserRepository {
    public void save(String username, String email) {
        System.out.println("Guardando usuario en la base de datos: " + username);
    }
}

class EmailService {
    public void sendWelcomeEmail(String email) {
        System.out.println("Enviando correo de bienvenida a: " + email);
    }
}

public class UserManager {
    private final UserRepository repository = new UserRepository();
    private final EmailService emailService = new EmailService();

    public void registerUser(String username, String email, String password) {
        repository.save(username, email);
        emailService.sendWelcomeEmail(email);
    }

    public boolean authenticate(String password) {
        return password.equals("secret123");
    }
}
