package largeclass;

public class Customer {
    private String name;
    private String address;
    private String email;
    private String phoneNumber;
    private double balance;
  
    public Customer(String name, String address, String email, String phoneNumber, double balance) {
      this.name = name;
      this.address = address;
      this.email = email;
      this.phoneNumber = phoneNumber;
      this.balance = balance;
    }
  
    // Getters and Setters for all fields
  
    public void makePayment(double amount) {
      // Code to apply payment
    }
  
    public void addOrder(Order order) {
      // Code to add order to customer
    }
  
    public void sendEmail(String message) {
      // Code to send email to customer
    }
  
    // More methods for customer management
  }
  
