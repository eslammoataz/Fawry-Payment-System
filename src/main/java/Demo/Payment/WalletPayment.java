package Demo.Payment;
import Demo.Authentication.AuthenticationSerivce;
import Demo.Users.Customer;
import org.springframework.stereotype.Component;

import static Demo.Authentication.AuthenticationSerivce.dataBase;


@Component
public class WalletPayment implements Payment {

    @Override
    public String pay(double amount, Customer currentCustomer,String serviceName){
        if(currentCustomer.wallet < amount)
            return "Not enough Wallet balance";
        currentCustomer.wallet-=amount;
        Transaction transaction = new Transaction();
        transaction.amount = amount;
//        transaction.setCustomer(currentCustomer);
        transaction.transactionID=currentCustomer.transactions.size()+1;
        transaction.customerID=dataBase.getCustomerID(currentCustomer);
        currentCustomer.transactions.add(transaction);
        transaction.method="Wallet Payment";
        transaction.relatedService=serviceName;
        AuthenticationSerivce.dataBase.usersTransactions.add(transaction);
        return "Payment Done By Wallet";
    }
}
