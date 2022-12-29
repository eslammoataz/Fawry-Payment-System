package Demo.ServiceProviders;
import Demo.Payment.Payment;
import Demo.Users.Customer;
import org.springframework.stereotype.Component;

@Component

public class VodafneMobileService extends Services {
    public VodafneMobileService() {super.amount=70;
    }

    @Override
    public String pay(Payment payment, double _amount, Customer customer,String serviceName){
        return payment.pay(_amount ,customer,serviceName);
    }
}
