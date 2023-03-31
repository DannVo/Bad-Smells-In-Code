package envy;

public class Customer {
    private String name;
    private Address address;
    private String email;

    public Customer(String name, Address address, String email) {
        this.name = name;
        this.address = address;
        this.email = email;
    }


    // Feature Envy
    public String getAddressString() {
        return this.address.getStreet() + ", " + this.address.getCity() + ", " +
                this.address.getState() + " " + this.address.getZipcode() + ", " + this.address.getCountry();
    }

 
}

