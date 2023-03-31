public interface PaymentProcessor {
    void processPayment(double amount);
}

public class CreditCardProcessor implements PaymentProcessor {
    public void processPayment(double amount) {
        // process credit card payment
    }
}

public class PaypalProcessor implements PaymentProcessor {
    public void processPayment(double amount) {
        // process PayPal payment
    }
}

public class InvoiceCreator {
    public void createInvoice(double amount, String customerName, String customerId) {
        // create an invoice for the customer with the provided details
    }
}
