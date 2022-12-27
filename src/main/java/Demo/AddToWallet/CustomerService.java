package Demo.AddToWallet;

import Demo.CurrentCustomer;
import Demo.DataBase;
import Demo.Login.Customer;
import Demo.Login.LoginService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.security.PublicKey;

@Component
@Service
public class CustomerService {
    Customer customer;
    DataBase dataBase;

    public CustomerService(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    public String addtowallet(Customer customer, double amount) {
        Boolean exists = dataBase.checkCustomer(customer);
        customer = dataBase.getCustomer(customer);
        if(exists){
            customer.wallet+=amount;
            return "Amount Added Successfully ";
        }
        return "No such Customer acc found make sure to register first";
    }
    public double getWallet(Customer customer){
        Boolean exists = dataBase.checkCustomer(customer);
        if(exists){
            return customer.wallet;
        }
        return 0;
    }
    public String insideaddtowallet() {

        return "inside add to wallet ";
    }

}
