package Demo.ServiceProviders;

import Demo.Payment.CreditCardPayment;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@RestController
public class ServiceProviderController {
    ServiceProviderModel serviceProviderModel;

    public ServiceProviderController(ServiceProviderModel serviceProviderModel) {
        this.serviceProviderModel = serviceProviderModel;
    }

    @GetMapping("/{service}")
    public double getServiceamount(@RequestBody Map<String, String> input){
        return serviceProviderModel.getServiceAmount(input);
    }

    @PostMapping("/service/pay/")
    public String payService(@RequestBody Map<String, String> input){
        return serviceProviderModel.pay(input);
    }
}
