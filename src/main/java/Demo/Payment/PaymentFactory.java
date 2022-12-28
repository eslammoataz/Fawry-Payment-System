package Demo.Payment;

import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Objects;

@Component
public class PaymentFactory {
    public Payment create(String choice, Map<String, String> input) {
        Payment payment=null;
        if (choice.equals("CreditCard"))
            payment = new CreditCardPayment(input.get("cardNumber"), input.get("cvv"));
        else if(choice.equals("Wallet"))
            payment = new WalletPayment();
        else if(choice.equals("Cash"))
            payment = new CashPayment();
        return payment;
    }
}
