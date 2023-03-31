package SpeculativeGenerality;

import SpeculativeGenerality.NotClean.Person;
import SpeculativeGenerality.NotClean.TelephoneNumber;

public class Main {
    public static void main(String[] args) {
        //Lazy class
        Person person = new Person();
        person.setName("Nguyen Van A");
        TelephoneNumber number = new TelephoneNumber();
        number.setMobileNo("0123456789");
        person.setNumbers(number);
        System.out.println(person.getName() + " " + person.getNumbers().getMobileNo());

        //Solution
        Solution employee = new Solution();
        employee.setName("Nguyen Van A");;
        employee.setMobileNo("0123456789");
        System.out.println(employee.getName() + " " + employee.getMobileNo());
    }
}
