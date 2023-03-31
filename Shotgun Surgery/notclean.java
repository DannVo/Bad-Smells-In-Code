package shotgun;

public class Order {
    private int orderId;
    private String customerName;
    private String customerAddress;
    private double totalPrice;

    public Order(int orderId, String customerName, String customerAddress, double totalPrice) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.totalPrice = totalPrice;
    }

    public void calculateTotalPrice() {
        // calculate total price based on order items and customer details
    }

    public void saveOrder() {
        // save the order information to the database
    }
}

public class OrderManager {
    private Order order;

    public void removeOrderItem(OrderItem orderItem) {
        // remove the order item from the order and recalculate the total price
        order.getItems().remove(orderItem);
        order.calculateTotalPrice();
        order.saveOrder();
    }

    public void cancelOrder() {
        // cancel the order and update the order status
        order.setStatus("cancelled");
        order.saveOrder();
    }

    public void updateCustomerAddress(String newAddress) {
        // update the customer address and save the order
        order.setCustomerAddress(newAddress);
        order.saveOrder();
    }
}
