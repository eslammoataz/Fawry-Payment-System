package Demo.Payment;
import static Demo.Login.LoginService.currentCustomer;
public class CashPayment implements Payment{

    @Override
    public String pay( double amount) {
        Transaction transaction = new Transaction();
        transaction.amount = amount;
        transaction.userName = currentCustomer.username;
        transaction.transactionID=currentCustomer.transactions.size()+1;
        currentCustomer.transactions.add(transaction);
        return "Payment Done By CashPayment";
    }
}
