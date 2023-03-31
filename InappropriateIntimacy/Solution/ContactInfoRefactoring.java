package InappropriateIntimacy.Solution;

public class ContactInfoRefactoring {
    private String city, state, streetName;

    public ContactInfoRefactoring(){}

    public ContactInfoRefactoring(String city, String state, String streetName) {
        this.city = city;
        this.state = state;
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String GetFullAddress(){
        return getStreetName() + " " + getState() + " " + getCity();
    }
}
