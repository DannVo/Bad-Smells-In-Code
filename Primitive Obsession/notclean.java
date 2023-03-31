package obsession;

public class Order {
    private String id;
    private String customerName;
    private String customerPhone;
    private String customerPaymentMethod;
    private String productName;
    private double productPrice;
    private int productQuantity;

    public Order(String id, String customerName, String customerPhone, String customerPaymentMethod, String productName, double productPrice, int productQuantity) {
        this.id = id;
        this.customerName = customerName;
        this.customerPhone = customerPhone;
        this.customerPaymentMethod = customerPaymentMethod;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }
    
    // other methods...


}

