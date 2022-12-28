package Demo.ServiceProviders;
import Demo.Payment.Payment;
import org.springframework.stereotype.Component;

import static Demo.Login.LoginService.currentCustomer;
@Component

public class OrangeMobileService extends Services {
    public OrangeMobileService() {super.amount=10;
    }

    @Override
    public String pay(Payment payment, double amount) {
        return null;
    }
}
