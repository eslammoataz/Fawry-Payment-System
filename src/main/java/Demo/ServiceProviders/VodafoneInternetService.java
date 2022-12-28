package Demo.ServiceProviders;

import Demo.Payment.Payment;
import org.springframework.stereotype.Component;

import static Demo.Login.LoginService.currentCustomer;
@Component

public class VodafoneInternetService extends Services{
    public VodafoneInternetService() {super.amount=30;
    }

    @Override
    public String pay(Payment payment , double _amount) {
        return payment.pay(_amount);
    }
}
