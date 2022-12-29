package Demo.ServiceProviders;

import Demo.Payment.Payment;
import Demo.Users.Customer;
import org.springframework.stereotype.Component;

@Component

public class VodafoneInternetService extends Services{
    public VodafoneInternetService() {super.amount=30;
    }

    @Override
    public String pay(Payment payment, double amount, Customer customer) {
        return payment.pay(amount,customer);
    }
}
