package Demo.Payment;

import Demo.Authentication.AuthenticationSerivce;
import Demo.Users.Customer;

//@Component
public class CreditCardPayment implements Payment{
    String cardNumber;
    String cvv;

    public CreditCardPayment(String cardNumber, String cvv) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
    }

    @Override
    public String pay(double amount, Customer currentCustomer){
        Transaction transaction = new Transaction();
        transaction.amount = amount;
        transaction.setCustomer(currentCustomer);
        transaction.transactionID=currentCustomer.transactions.size()+1;
        currentCustomer.transactions.add(transaction);
        transaction.method="Credit Card Payment";
        AuthenticationSerivce.dataBase.usersTransactions.add(transaction);

        return "Payment Done By Credit Card";
    }
}
