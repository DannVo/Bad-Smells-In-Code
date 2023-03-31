package MiddleMan.Solution;

public class Person {
    public Department department;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Person GetManager(){
        return department.getManager();
    }
}
