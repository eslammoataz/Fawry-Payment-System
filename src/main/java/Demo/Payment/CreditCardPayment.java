package Demo.Payment;

import Demo.Authentication.AuthenticationSerivce;
import Demo.ServiceProviders.Services;
import Demo.Users.Customer;

import static Demo.Authentication.AuthenticationSerivce.dataBase;

//@Component
public class CreditCardPayment implements Payment{
    String cardNumber;
    String cvv;

    public CreditCardPayment(String cardNumber, String cvv) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
    }

    @Override
    public String pay(double amount, Customer currentCustomer, String relatedService){
        Transaction transaction = new Transaction();
        transaction.amount = -amount;
        transaction.transactionID=currentCustomer.transactions.size()+1;
        transaction.customerID=dataBase.getCustomerID(currentCustomer);
        currentCustomer.transactions.add(transaction);
        transaction.method="Credit Card Payment";
        transaction.relatedService=relatedService;
        AuthenticationSerivce.dataBase.usersTransactions.add(transaction);

        return "Payment Done By Credit Card";
    }
}
