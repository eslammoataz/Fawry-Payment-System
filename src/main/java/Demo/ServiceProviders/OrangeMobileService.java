package Demo.ServiceProviders;
import Demo.Payment.Payment;
import org.springframework.stereotype.Component;

@Component

public class OrangeMobileService extends Services {
    public OrangeMobileService() {super.amount=10;
    }

    @Override
    public String pay(Payment payment , double _amount) {
        return payment.pay(_amount);
    }
}
