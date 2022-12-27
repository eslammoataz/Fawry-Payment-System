package Demo.Payment;

public class PaymentFactory {
    public Payment create(String choice){
        if(choice=="CreditCard")
            return new CreditCardPayment();
    }
}
