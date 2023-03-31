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












  
  
  public class Employee extends Person {
    private String employeeId;
  
    public Employee(String name, int age, String employeeId) {
      super(name, age);
      this.employeeId = employeeId;
    }
  
    public String getEmployeeId() {
      return employeeId;
    }
  
    public void setEmployeeId(String employeeId) {
      this.employeeId = employeeId;
    }
  }
  
  public class Customer extends Person {
    private String customerId;
  
    public Customer(String name, int age, String customerId) {
      super(name, age);
      this.customerId = customerId;
    }
  
    public String getCustomerId() {
      return customerId;
    }
  
    public void setCustomerId(String customerId) {
      this.customerId = customerId;
    }
  }
  
