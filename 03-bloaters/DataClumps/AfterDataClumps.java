class Address {
    private final String street;
    private final String city;
    private final String zipCode;

    public Address(String street, String city, String zipCode) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }

    public String getFullAddress() {
        return street + ", " + city + " - " + zipCode;
    }
}

public class Customer {
    private Address address;

    public void updateAddress(Address address) {
        this.address = address;
    }

    public void printShippingLabel(Address address) {
        System.out.println("Envío a: " + address.getFullAddress());
    }
}
