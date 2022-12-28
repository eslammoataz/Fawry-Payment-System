package Demo.Payment;
import org.springframework.stereotype.Component;

import static Demo.Authentication.AuthenticationSerivce.currentCustomer;
@Component
public class WalletPayment implements Payment {

    @Override
    public String pay( double amount) {
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
