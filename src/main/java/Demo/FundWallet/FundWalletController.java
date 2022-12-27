package Demo.FundWallet;

import Demo.Payment.CreditCardPayment;
import org.springframework.web.bind.annotation.*;

@RestController
public class FundWalletController {
    FundWalletService service;


    public FundWalletController(FundWalletService service ) {
        this.service = service;
    }

    @PostMapping("/addwallet/creditcard/{amount}")
    public String fundWalletCreditCard(@RequestBody CreditCardPayment creditCardPayment
            ,@PathVariable("amount")double amount){
       return service.fundByCredit(creditCardPayment,amount);
    }

    @PostMapping("/addwallet/wallet/{amount}")
    public String fundByWallet(@PathVariable("amount")double amount){
        return service.fundByWallet(amount);
    }

    @GetMapping("/getwallet")
    public double addtowallet(){
        return service.getWalletBalance();
    }
}
