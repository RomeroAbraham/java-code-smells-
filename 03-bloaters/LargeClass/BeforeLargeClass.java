public class UserManager {
    private String username;
    private String email;

    public void registerUser(String username, String email, String password) {
        this.username = username;
        this.email = email;

        System.out.println("Conectando a base de datos...");
        System.out.println("INSERT INTO users VALUES ('" + username + "')");

        System.out.println("Conectando al servidor SMTP...");
        System.out.println("Enviando correo de bienvenida a " + email);
    }

    public boolean authenticate(String password) {
        return password.equals("secret123");
    }
}
