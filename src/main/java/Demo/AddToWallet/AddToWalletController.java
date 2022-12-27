package Demo.AddToWallet;

import Demo.Login.Customer;
import org.springframework.web.bind.annotation.*;

@RestController
public class AddToWalletController {
    CustomerService service;

    public AddToWalletController(CustomerService service) {
        this.service = service;
    }

    @PostMapping("/{amount}")
    public String addtowallet(@RequestBody Customer customer, @PathVariable("amount")double amount){
       return service.addtowallet(customer,amount);
    }

    @GetMapping("/getamount")
    public double addtowallet(@RequestBody Customer customer){
        return service.getWallet(customer);
    }
    public String okay(){
        return service.insideaddtowallet();
    }
}
