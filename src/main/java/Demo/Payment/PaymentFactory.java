package Demo.Payment;

import java.util.Map;

public class PaymentFactory {
    public Payment create(String choice, Map<String, String> input) {
        Payment payment;
        if (choice == "CreditCard")
            payment = new CreditCardPayment(input.get("cardNumber"), input.get("cvv"));
        else
            payment = new WalletPayment();

        return payment;
    }
}
