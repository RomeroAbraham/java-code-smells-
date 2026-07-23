class ZipCode {
    public String getCode() { return "090150"; }
}

class Address {
    private ZipCode zipCode = new ZipCode();
    public String getZipCodeValue() { return zipCode.getCode(); }
}

class Customer {
    private Address address = new Address();
    
    public String getZipCode() { 
        return address.getZipCodeValue(); 
    }
}

public class ShippingService {
    public void ship(Customer customer) {
        String zip = customer.getZipCode();
        System.out.println("Enviando al código postal: " + zip);
    }
}
