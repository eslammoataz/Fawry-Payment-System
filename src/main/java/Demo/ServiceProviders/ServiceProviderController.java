package Demo.ServiceProviders;

import Demo.Payment.CreditCardPayment;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Objects;

@RestController
public class ServiceProviderController {
    ServiceProviderModel serviceProviderModel;

    public ServiceProviderController(ServiceProviderModel serviceProviderModel) {
        this.serviceProviderModel = serviceProviderModel;
    }

    @GetMapping("/service/getamount")
    public double getServiceamount(@RequestBody HashMap<String, Objects>Parameters){
        return serviceProviderModel.getServiceAmount(Parameters);
    }

    @PostMapping("/etisalatmobilerecharge/pay/{amount}")
    public String payEtisalatInternet(@RequestBody CreditCardPayment creditCardPayment
            ,@PathVariable("amount")double amount){
        return serviceProviderModel.etisalatInternet(creditCardPayment,amount);
    }
}
