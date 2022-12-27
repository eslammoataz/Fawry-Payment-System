package Demo.ServiceProviders;

import Demo.Payment.Payment;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Component
@Service
public class ServiceProviderModel {
    Services serviceProvider;

    public ServiceProviderModel(BigFactory factory) {
        this.factory = factory;
    }

    BigFactory factory;

    public String pay(Map<String, String> input){
        serviceProvider =  factory.create(input.get("ServiceProvider"));

        return serviceProvider.pay(payment , amount);
    }
    public double getServiceAmount(Map<String, String> input){
        serviceProvider = factory.create(input.get("ServiceProvider"));
        return serviceProvider.amount;
    }

}
