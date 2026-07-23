class PhoneNumber {
    private final String number;

    public PhoneNumber(String number) {
        if (number == null || !number.matches("\\d{10}")) {
            throw new IllegalArgumentException("El número de teléfono debe tener exactamente 10 dígitos numéricos");
        }
        this.number = number;
    }

    public String getNumber() {
        return number;
    }
}

public class UserProfile {
    private PhoneNumber phoneNumber;

    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }
}
