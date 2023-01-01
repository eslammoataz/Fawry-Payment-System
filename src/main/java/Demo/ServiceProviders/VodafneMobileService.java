package Demo.ServiceProviders;
import Demo.Payment.Payment;
import Demo.Users.Customer;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component

public class VodafneMobileService extends Services {
    String mobileNumber;
    public VodafneMobileService() {super.amount=70;
        serviceName="Vodafone Mobile Services";
    }

    @Override
    public String servicePay(Payment payment, Customer customer, Services serviceProvider, Map<String, String> input) {
        return formHandler.paymentHandling(input,this,payment,customer);
    }
}
