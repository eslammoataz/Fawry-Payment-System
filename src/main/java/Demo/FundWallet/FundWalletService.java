package Demo.FundWallet;

import Demo.DataBase;
import Demo.Payment.CreditCardPayment;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import static Demo.Login.LoginService.currentCustomer;


@Component
@Service
public class FundWalletService {
    DataBase dataBase;

    public FundWalletService(DataBase dataBase) {
        this.dataBase = dataBase;
    }
    public String fundByCredit(CreditCardPayment creditCardPayment ,double amount) {
        Boolean exists = dataBase.checkCustomer(currentCustomer);
        if(exists){
            creditCardPayment.pay(amount);
        }
        return "No such Customer acc found make sure to register first";
    }


//    public String payByWallet(double amount) {
//        Boolean exists = dataBase.checkCustomer(currentCustomer);
//        if(exists){
//            currentCustomer.wallet+=amount;
//            return "Amount Added Successfully Using Wallet ";
//        }
//        return "No such Customer acc found make sure to register first";
//    }

    public double getWalletBalance(){
        Boolean exists = dataBase.checkCustomer(currentCustomer);
        if(exists){
            return currentCustomer.wallet;
        }
        return 0;
    }
}
