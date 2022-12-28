package Demo.Payment;
import org.springframework.stereotype.Component;

import static Demo.Login.LoginService.currentCustomer;
@Component
public class WalletPayment implements Payment {

    @Override
    public String pay( double amount) {
        if(currentCustomer.wallet < amount)
            return "Not enough Wallet balance";
        Transaction transaction = new Transaction();
        transaction.userName = currentCustomer.username;
        currentCustomer.wallet-=amount;
        transaction.amount = amount;
        currentCustomer.transactions.add(transaction);
        return "Payment Done By Wallet";
    }
}
