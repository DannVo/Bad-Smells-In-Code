package switch;

public class PaymentService {
    public void processPayment(String paymentMethod, double amount) {
        switch(paymentMethod) {
            case "creditCard": 
                chargeCreditCard(amount); 
                break;
            case "debitCard": 
                chargeDebitCard(amount); 
                break;
            case "bankTransfer": 
                processBankTransfer(amount); 
                break;
            case "paypal": 
                processPaypal(amount); 
                break;
            default:
                throw new IllegalArgumentException("Invalid payment method: " + paymentMethod);
        }
    }

    private void chargeCreditCard(double amount) {
        // code for charging credit card
    }

    private void chargeDebitCard(double amount) {
        // code for charging debit card
    }

    private void processBankTransfer(double amount) {
        // code for processing bank transfer
    }

    private void processPaypal(double amount) {
        // code for processing paypal
    }
}

