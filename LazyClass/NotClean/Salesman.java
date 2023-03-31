package LazyClass.NotClean;

import LazyClass.NotClean.Employee;

public class Salesman extends Employee {
    private float salary;
    private String address;

    public Salesman(){}

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
