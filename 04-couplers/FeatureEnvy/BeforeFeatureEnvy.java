class CustomerContact {
    private String areaCode;
    private String number;

    public CustomerContact(String areaCode, String number) {
        this.areaCode = areaCode;
        this.number = number;
    }

    public String getAreaCode() { return areaCode; }
    public String getNumber() { return number; }
}

public class OrderPrinter {
    // Mal olor: Este método vive en OrderPrinter pero solo usa datos de CustomerContact
    public String formatPhoneNumber(CustomerContact contact) {
        return "(" + contact.getAreaCode() + ") " + contact.getNumber();
    }
}
