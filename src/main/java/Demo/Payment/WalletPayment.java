package Demo.Payment;
import static Demo.Login.LoginService.currentCustomer;
public class WalletPayment implements Payment {

    @Override
    public Transaction pay( double amount) {
        Transaction transaction = new Transaction();
        System.out.println("Transaction Done Successfully by Wallet Payment");
        transaction.amount = amount;
        transaction.userName = currentCustomer.username;
        currentCustomer.wallet -= amount;
        System.out.println("Your Wallet Amount is " + currentCustomer.wallet);
        return transaction;
    }
}
