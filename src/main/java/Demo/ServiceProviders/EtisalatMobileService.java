package Demo.ServiceProviders;

import Demo.Payment.Payment;
import Demo.Users.Customer;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class EtisalatMobileService extends Services {
    String mobileNumber;

    public EtisalatMobileService() {
        super.amount = 45;
        serviceName="Etisalat Mobile Services";
    }

    @Override
    public String servicePay(Payment payment, Customer customer, Services serviceProvider, Map<String, String> input) {
        return formHandler.paymentHandling(input, this, payment, customer);
    }
}
