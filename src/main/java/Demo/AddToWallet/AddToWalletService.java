package Demo.AddToWallet;

import Demo.DataBase;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import static Demo.Login.LoginService.currentCustomer;


@Component
@Service
public class AddToWalletService {
    DataBase dataBase;

    public AddToWalletService(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    public String addtowallet(double amount) {
        Boolean exists = dataBase.checkCustomer(currentCustomer);
        if(exists){
            currentCustomer.wallet+=amount;
            return "Amount Added Successfully ";
        }
        return "No such Customer acc found make sure to register first";
    }
    public double getWallet(){
        Boolean exists = dataBase.checkCustomer(currentCustomer);
        if(exists){
            return currentCustomer.wallet;
        }
        return 0;
    }
    public String insideaddtowallet() {
        return "inside add to wallet ";
    }

}
