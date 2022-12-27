package Demo.Payment;

public class PaymentFactory {
    public Payment create(String choice , MA){
        if(choice=="CreditCard")
            return new CreditCardPayment();
    }
}
