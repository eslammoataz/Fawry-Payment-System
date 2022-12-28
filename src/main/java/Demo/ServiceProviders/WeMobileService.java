package Demo.ServiceProviders;

import Demo.Payment.Payment;
import org.springframework.stereotype.Component;

@Component

public class WeMobileService extends Services {
    public WeMobileService() {super.amount = 100;
    }

    @Override
    public String pay(Payment payment , double _amount) {
        return payment.pay(_amount);
    }
}
