package Demo.Payment;

import org.springframework.stereotype.Component;

import java.util.Map;
@Component
public class PaymentFactory {
    public Payment create(String choice, Map<String, String> input) {
        Payment payment;
        if (choice.equals("CreditCard"))
            payment = new CreditCardPayment(input.get("cardNumber"), input.get("cvv"));
        else
            payment = new WalletPayment();

        return payment;
    }
}
