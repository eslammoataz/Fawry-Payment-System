package Demo.Payment;

import org.springframework.stereotype.Component;

import java.util.Map;
@Component
public class PaymentFactory {
    public Payment create(String choice, Map<String, String> input) {
        Payment payment;
        if (choice == "CreditCard")
            payment = new CreditCardPayment("123", "123");
        else
            payment = new WalletPayment();

        return payment;
    }
}
