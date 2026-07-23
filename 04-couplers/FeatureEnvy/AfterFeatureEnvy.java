public class CustomerContact {
    private String areaCode;
    private String number;

    public CustomerContact(String areaCode, String number) {
        this.areaCode = areaCode;
        this.number = number;
    }

    public String getFormattedPhoneNumber() {
        return "(" + areaCode + ") " + number;
    }
}

class OrderPrinter {
    public void printContact(CustomerContact contact) {
        System.out.println("Teléfono: " + contact.getFormattedPhoneNumber());
    }
}
