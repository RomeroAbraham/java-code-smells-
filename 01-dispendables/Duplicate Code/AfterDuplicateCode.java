public class UserRegistration {
    public void registerAdmin(String email) {
        validateEmail(email);
        System.out.println("Admin registrado: " + email);
    }

    public void registerCustomer(String email) {
        validateEmail(email);
        System.out.println("Cliente registrado: " + email);
    }

    private void validateEmail(String email) {
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Email inválido");
        }
    }
}
