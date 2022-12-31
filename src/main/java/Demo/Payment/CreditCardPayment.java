package Demo.Payment;

import Demo.Authentication.AuthenticationSerivce;
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
    public String pay(double amount, Customer currentCustomer,String serviceName){
        Transaction transaction = new Transaction();
        transaction.amount = amount;
//        transaction.setCustomer(currentCustomer);
        transaction.transactionID=currentCustomer.transactions.size()+1;
        transaction.customerID=dataBase.getCustomerID(currentCustomer);

        currentCustomer.transactions.add(transaction);
        transaction.method="Credit Card Payment";
        transaction.relatedService=serviceName;
        AuthenticationSerivce.dataBase.usersTransactions.add(transaction);

        return "Payment Done By Credit Card";
    }
}
