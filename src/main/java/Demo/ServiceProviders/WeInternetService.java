package Demo.ServiceProviders;
import Demo.Payment.Payment;
import Demo.Users.Customer;
import org.springframework.stereotype.Component;

@Component
public class WeInternetService extends Services {

    public WeInternetService() {
        super.amount=30;
    }

    @Override
    public String pay(Payment payment, double amount, Customer customer) {
        return payment.pay(amount,customer);
    }
}
