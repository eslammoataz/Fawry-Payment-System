package Demo.FundWallet;

import Demo.DataBase;
import Demo.Payment.CreditCardPayment;
import Demo.Users.Customer;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Currency;



@Component
@Service
public class FundWalletService {
    DataBase dataBase;
    Customer customer;

    public FundWalletService(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    public String fundByCredit(CreditCardPayment creditCardPayment, double amount, String token) {

        customer = getCustomerByToken(token);
        customer.wallet += amount;
        return creditCardPayment.pay(amount,customer);
    }

    public double getWalletBalance(String token) {
        customer = getCustomerByToken(token);
        Boolean exists = dataBase.checkCustomer(customer);
        if (exists) {
            return customer.wallet;
        }
        return 0;
    }
    public Customer getCustomerByToken(String token){
        //creating customer that will will work on
        char charindex =token.charAt(token.length()-1);
        String indx =""+charindex;
        Customer customer = dataBase.getCustomer(Integer.parseInt(indx));
        return customer;
    }

}
