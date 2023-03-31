package parallel;

public class Person {
    private String name;
    private int age;
  
    public Person(String name, int age) {
      this.name = name;
      this.age = age;
    }
  
    public String getName() {
      return name;
    }
  
    public void setName(String name) {
      this.name = name;
    }
  
    public int getAge() {
      return age;
    }
  
    public void setAge(int age) {
      this.age = age;
    }
  }



  










  
  public class Employee {
    private Person person;
    private String employeeId;
  
    public Employee(String name, int age, String employeeId) {
      this.person = new Person(name, age);
      this.employeeId = employeeId;
    }
  
    public String getName() {
      return person.getName();
    }
  
    public void setName(String name) {
      person.setName(name);
    }
  
    public int getAge() {
      return person.getAge();
    }
  
    public void setAge(int age) {
      person.setAge(age);
    }
  
    public String getEmployeeId() {
      return employeeId;
    }
  
    public void setEmployeeId(String employeeId) {
      this.employeeId = employeeId;
    }
  }
  
  public class Customer {
    private Person person;
    private String customerId;
  
    public Customer(String name, int age, String customerId) {
      this.person = new Person(name, age);
      this.customerId = customerId;
    }
  
    public String getName() {
      return person.getName();
    }
  
    public void setName(String name) {
      person.setName(name);
    }
  
    public int getAge() {
      return person.getAge();
    }
  
    public void setAge(int age) {
      person.setAge(age);
    }
  
    public String getCustomerId() {
      return customerId;
    }
  
    public void setCustomerId(String customerId) {
      this.customerId = customerId;
    }
  }
  
