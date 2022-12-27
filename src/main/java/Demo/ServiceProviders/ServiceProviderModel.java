package Demo.ServiceProviders;

import Demo.Payment.Payment;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Objects;

@Component
@Service
public class ServiceProviderModel {
    Services serviceProvider;
    BigFactory factory;

    public String etisalatInternet(Payment payment , double amount){
        serviceProvider =  factory.create("1");
        return serviceProvider.pay(payment , amount);
    }
    public double getServiceAmount(HashMap<String, Objects> parameters){
        serviceProvider = new EtisalatInternetService();
        return serviceProvider.amount;
    }

}
