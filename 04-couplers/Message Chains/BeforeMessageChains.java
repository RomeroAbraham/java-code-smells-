class ZipCode {
    public String getCode() { return "090150"; }
}

class Address {
    private ZipCode zipCode = new ZipCode();
    public ZipCode getZipCode() { return zipCode; }
}

class Customer {
    private Address address = new Address();
    public Address getAddress() { return address; }
}

public class ShippingService {
    public void ship(Customer customer) {
        String zip = customer.getAddress().getZipCode().getCode();
        System.out.println("Enviando al código postal: " + zip);
    }
}
