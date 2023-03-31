package InappropriateIntimacy.NotClean;

import InappropriateIntimacy.NotClean.ContactInfor;

public class User {
    private String Name;
    private ContactInfor contactInfor;

    public User(){}

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getFullAddress(){
        return contactInfor.getStreetName() + " " + contactInfor.getState() + " " + contactInfor.getCity();
    }
}
