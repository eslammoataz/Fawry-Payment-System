package Demo.ServiceProviders;

import Demo.Payment.Payment;
import Demo.Users.Customer;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component

public class VodafoneInternetService extends Services {
    String internetNumber;

    public VodafoneInternetService() {
        super.amount = 30;
    }

    @Override
    public String servicePay(Payment payment, Customer customer, Services serviceProvider, Map<String, String> input) {
        return formHandler.paymentHandling(input, this, payment, customer);
    }
}
