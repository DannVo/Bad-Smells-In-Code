package envy;

public class Address {
    private String street;
    private String city;
    private String state;
    private String country;
    private String zipcode;

    public Address(String street, String city, String state, String country, String zipcode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.country = country;
        this.zipcode = zipcode;
    }   

    public String getAddressString() {
        return this.street + ", " + this.city + ", " +
                this.state + " " + this.zipcode + ", " + this.country;
    }
}

public class Customer {
    private String name;
    private Address address;
    private String email;

    public Customer(String name, Address address, String email) {
        this.name = name;
        this.address = address;
        this.email = email;
    }


    public String getAddressString() {
        return this.address.getAddressString();
    }
}
