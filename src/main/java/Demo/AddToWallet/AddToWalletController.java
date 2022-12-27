package Demo.AddToWallet;

import org.springframework.web.bind.annotation.*;

@RestController
public class AddToWalletController {
    AddToWalletService service;


    public AddToWalletController(AddToWalletService service ) {
        this.service = service;
    }

    @PostMapping("/addwallet/{amount}")
    public String addtowallet( @PathVariable("amount")double amount){
       return service.addtowallet(amount);
    }


    @GetMapping("/getwallet")
    public double addtowallet(){
        return service.getWallet();
    }
    public String okay(){
        return service.insideaddtowallet();
    }
}
