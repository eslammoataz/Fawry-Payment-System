package Demo.Payment;
import static Demo.Authentication.AuthenticationSerivce.currentCustomer;
public class CashPayment implements Payment{

    @Override
    public String pay( double amount) {
        Transaction transaction = new Transaction();
        transaction.amount = amount;
        transaction.userName = currentCustomer.username;
        transaction.transactionID=currentCustomer.transactions.size()+1;
        transaction.method="Cash Payment";
        currentCustomer.transactions.add(transaction);
        return "Payment Done By CashPayment";
    }
}
