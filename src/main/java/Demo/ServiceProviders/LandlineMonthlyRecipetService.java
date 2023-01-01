package Demo.ServiceProviders;
import Demo.Payment.Payment;
import Demo.Users.Customer;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class LandlineMonthlyRecipetService extends Services {
    String landlineNumber;

    public LandlineMonthlyRecipetService() {
        super.amount=30;
        serviceName="Landline Montly Rciept";
    }

    @Override
    public String servicePay(Payment payment, Customer customer, Services serviceProvider, Map<String, String> input) {
        return formHandler.paymentHandling(input,this,payment,customer);
    }

}
