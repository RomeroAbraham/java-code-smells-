public class UserRegistration {
    public void registerAdmin(String email) {
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Email inválido");
        }
        System.out.println("Admin registrado: " + email);
    }

    public void registerCustomer(String email) {
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Email inválido");
        }
        System.out.println("Cliente registrado: " + email);
    }
}
