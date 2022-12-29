package Demo.Payment;
import Demo.Users.Customer;
import org.springframework.stereotype.Component;


@Component
public class WalletPayment implements Payment {

    @Override
    public String pay(double amount, Customer currentCustomer){
        if(currentCustomer.wallet < amount)
            return "Not enough Wallet balance";
        currentCustomer.wallet-=amount;
        Transaction transaction = new Transaction();
        transaction.amount = amount;
        transaction.userName = currentCustomer.username;
        transaction.transactionID=currentCustomer.transactions.size()+1;
        currentCustomer.transactions.add(transaction);
        transaction.method="Wallet Payment";
        return "Payment Done By Wallet";
    }
}
