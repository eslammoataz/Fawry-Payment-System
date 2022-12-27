package Demo.ServiceProviders;

import Demo.Payment.Payment;
import Demo.Payment.PaymentFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Component
@Service
public class ServiceProviderModel {
    Services serviceProvider;
    BigFactory factory;
    PaymentFactory paymentFactory;

    public ServiceProviderModel(BigFactory factory) {
        this.factory = factory;
        this.paymentFactory = new PaymentFactory();
    }

    public String pay(Map<String,String>input) {
        serviceProvider = factory.create("EtisalatMobileService");
        Payment payment = paymentFactory.create(input.get("paymentmethod"),input);
        return serviceProvider.pay(payment, 123.0);
    }

    public double getServiceAmount(Map<String, String> input) {
        serviceProvider = factory.create(input.get("ServiceProvider"));
        return serviceProvider.amount;
    }

}
