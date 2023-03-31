package switch;

public interface PaymentStrategy {
    void processPayment(double amount);
}

public class CreditCardPaymentStrategy implements PaymentStrategy {
    public void processPayment(double amount) {
        // code for charging credit card
    }
}

public class DebitCardPaymentStrategy implements PaymentStrategy {
    public void processPayment(double amount) {
        // code for charging debit card
    }
}

public class BankTransferPaymentStrategy implements PaymentStrategy {
    public void processPayment(double amount) {
        // code for processing bank transfer
    }
}
public class PaypalPaymentStrategy implements PaymentStrategy {
    public void processPayment(double amount) {
        // code for processing Paypal
    }
}

public class PaymentService {
    private PaymentStrategy paymentStrategy;

    public PaymentService(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(double amount) {
        paymentStrategy.processPayment(amount);
    }
}

