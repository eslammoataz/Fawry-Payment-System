package Demo.Payment;
import static Demo.Login.LoginService.currentCustomer;
public class CashPayment implements Payment{

    @Override
    public Transaction pay(double amount) {
        Transaction transaction = new Transaction();
        System.out.println("Transaction Done Successfully By Cash Payment");
        transaction.amount = amount;
        transaction.userName = currentCustomer.username;
        return transaction;
    }
}
