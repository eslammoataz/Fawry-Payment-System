package Demo.ServiceProviders;
import Demo.Payment.Payment;
import org.springframework.stereotype.Component;

@Component

public class OrangeInternetService extends Services{


    public OrangeInternetService() {super.amount=30;
    }

    @Override
    public String pay(Payment payment , double _amount) {
        return payment.pay(_amount);
    }
}
