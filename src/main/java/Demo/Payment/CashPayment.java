package Demo.Payment;
import Demo.Users.Customer;


public class CashPayment implements Payment{

    @Override
    public String pay(double amount, Customer currentCustomer) {
        Transaction transaction = new Transaction();
        transaction.amount = amount;
        transaction.customer=currentCustomer;
        transaction.transactionID=currentCustomer.transactions.size()+1;
        transaction.method="Cash Payment";
        currentCustomer.transactions.add(transaction);
        return "Payment Done By CashPayment";
    }
}
