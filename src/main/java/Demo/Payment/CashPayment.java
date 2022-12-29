package Demo.Payment;
import Demo.Authentication.AuthenticationSerivce;
import Demo.Users.Customer;

public class CashPayment implements Payment{

    @Override
    public String pay(double amount, Customer currentCustomer,String serviceName) {
        Transaction transaction = new Transaction();
        transaction.amount = amount;
        transaction.setCustomer(currentCustomer);
        transaction.transactionID=currentCustomer.transactions.size()+1;
        transaction.method="Cash Payment";
        currentCustomer.transactions.add(transaction);
        transaction.relatedService=serviceName;
        AuthenticationSerivce.dataBase.usersTransactions.add(transaction);
        return "Payment Done By CashPayment";
    }
}
