package Demo.ServiceProviders;
import Demo.Payment.Payment;
import org.springframework.stereotype.Component;

@Component
public class EtisalatInternetService extends Services {

    public EtisalatInternetService() {
        super.amount=30;
    }

    @Override
    public String pay(Payment payment , double _amount) {
        return payment.pay(_amount);
    }
}
