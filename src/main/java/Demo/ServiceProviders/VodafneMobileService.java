package Demo.ServiceProviders;
import Demo.Payment.Payment;
import org.springframework.stereotype.Component;

@Component

public class VodafneMobileService extends Services {
    public VodafneMobileService() {super.amount=70;
    }

    @Override
    public String pay(Payment payment, double amount) {

        return payment.pay(amount);
    }
}
