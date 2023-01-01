package Demo.ServiceProviders;

import Demo.Payment.Payment;
import Demo.Users.Customer;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class EtisalatInternetService extends Services  {
    String internetNumber;

    public EtisalatInternetService() {
        super.amount = 30;
        serviceName="Etisalat Internet Services";
    }

    @Override
    public String servicePay(Payment payment, Customer customer, Services serviceProvider, Map<String, String> input) {
        return formHandler.paymentHandling(input, this, payment, customer);
    }

    public void setInternetNumber(String internetNumber) {
        this.internetNumber = internetNumber;
    }

}
