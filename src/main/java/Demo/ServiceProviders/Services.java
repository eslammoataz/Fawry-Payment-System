package Demo.ServiceProviders;

import Demo.Payment.Payment;
import Demo.Users.Customer;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public abstract class Services {
    public int amount=50;
    public String serviceName;
    FormHandler formHandler;

    public void setFormHandler(FormHandler formHandler) {
        this.formHandler = formHandler;
    }

    public abstract String servicePay(Payment payment , Customer customer , Services serviceProvider, Map<String, String> input);


}
