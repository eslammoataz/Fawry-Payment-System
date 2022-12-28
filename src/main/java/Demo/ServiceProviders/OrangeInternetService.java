package Demo.ServiceProviders;
import Demo.Payment.Payment;
import org.springframework.stereotype.Component;

import static Demo.Login.LoginService.currentCustomer;
@Component

public class OrangeInternetService extends Services{


    public OrangeInternetService() {super.amount=30;
    }
    @Override
    public String pay(Payment payment, double amount) {
        return null;
    }
}
