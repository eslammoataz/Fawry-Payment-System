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
    public String pay(Payment payment, double _amount, Customer customer,String serviceName){
        return payment.pay(_amount ,customer,serviceName);
    }
}
