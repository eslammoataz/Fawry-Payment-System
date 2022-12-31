package Demo.ServiceProviders;
import Demo.Payment.Payment;
import Demo.Users.Customer;
import org.springframework.stereotype.Component;

@Component
public class LandlineMonthlyRecipetService extends Services {

    public LandlineMonthlyRecipetService() {
        super.amount=30;
    }

    @Override
    public String servicePay(Payment payment, double amount, Customer customer, String serviceName) {
        return payment.pay(amount,customer,serviceName);
    }

}
