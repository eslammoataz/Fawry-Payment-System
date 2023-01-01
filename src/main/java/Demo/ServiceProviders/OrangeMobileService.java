package Demo.ServiceProviders;
import Demo.Payment.Payment;
import Demo.Users.Customer;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component

public class OrangeMobileService extends Services {
    String mobileNumber;
    public OrangeMobileService() {
        super.amount=10;
        serviceName="Orange Mobile Services";
    }

    @Override
    public String servicePay(Payment payment, Customer customer, Services serviceProvider, Map<String, String> input) {
        return formHandler.paymentHandling(input,this,payment,customer);
    }
}
