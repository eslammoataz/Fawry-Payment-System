package Demo.Payment;
import static Demo.Login.LoginService.currentCustomer;
public class WalletPayment implements Payment {

    @Override
    public String pay( double amount) {
        if(currentCustomer.wallet < amount)
            return "Not enough Wallet balance";
        Transaction transaction = new Transaction();
        transaction.amount = amount;
        transaction.userName = currentCustomer.username;
        currentCustomer.wallet-=amount;
        return "Payment Done By Wallet";
    }
}
