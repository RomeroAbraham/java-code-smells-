public class UserProfile {
    private String phoneNumber;

    public void setPhoneNumber(String phoneNumber) {
        if (!phoneNumber.matches("\\d{10}")) {
            throw new IllegalArgumentException("El teléfono debe tener 10 dígitos");
        }
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
