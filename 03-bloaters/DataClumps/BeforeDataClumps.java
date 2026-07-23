public class Customer {
    private String street;
    private String city;
    private String zipCode;

    public void updateAddress(String street, String city, String zipCode) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }

    public void printShippingLabel(String street, String city, String zipCode) {
        System.out.println("Envío a: " + street + ", " + city + " - " + zipCode);
    }
}
