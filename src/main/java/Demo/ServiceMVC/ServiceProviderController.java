package Demo.ServiceMVC;

import Demo.Payment.Transaction;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Map;

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
    public String payService(@RequestHeader("Authorization") String token,@RequestBody Map<String, String> input){
        return serviceProviderModel.pay(input,token);
    }

    @GetMapping("/gettransactions")
    public ArrayList<Transaction> getTransactions(@RequestHeader("Authorization") String token){
        return serviceProviderModel.getTransaction(token);
    }

    @GetMapping("/getServices")
    public ArrayList<String> getServices(){
        return serviceProviderModel.getSerivcesNames();
    }

}
