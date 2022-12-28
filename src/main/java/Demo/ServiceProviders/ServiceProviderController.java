package Demo.ServiceProviders;

import Demo.Payment.CreditCardPayment;
import Demo.Payment.Transaction;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@RestController
public class ServiceProviderController {
    ServiceProviderModel serviceProviderModel;

    public ServiceProviderController(ServiceProviderModel serviceProviderModel) {
        this.serviceProviderModel = serviceProviderModel;
    }

    @GetMapping("/getserviceamount")
    public double getServiceamount(@RequestBody Map<String, String> input){
        return serviceProviderModel.getServiceAmount(input);
    }

    @PostMapping("/service/pay")
    public String payService(@RequestBody Map<String, String> input){
        return serviceProviderModel.pay(input);
    }

    @GetMapping("/gettransactions")
    public ArrayList<Transaction> getTransactions(){
        return serviceProviderModel.getTransaction();
    }

    @GetMapping("/getServices")
    public ArrayList<String> getServices(){
        return serviceProviderModel.getSerivcesNames();
    }

}
