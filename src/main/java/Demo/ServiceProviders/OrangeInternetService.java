package Demo.ServiceProviders;
import Demo.Payment.Payment;
import Demo.Users.Customer;
import org.springframework.stereotype.Component;

@Component

public class OrangeInternetService extends Services{


    public OrangeInternetService() {super.amount=30;
    }

    @Override
    public String servicePay(Payment payment, double _amount, Customer customer, String serviceName){
        return payment.pay(_amount ,customer,serviceName);
    }
}
