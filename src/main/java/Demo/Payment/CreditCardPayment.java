package Demo.Payment;

import static Demo.Authentication.AuthenticationSerivce.currentCustomer;
//@Component
public class CreditCardPayment implements Payment{
    String cardNumber;
    String cvv;

    public CreditCardPayment(String cardNumber, String cvv) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
    }

    @Override
    public String pay( double amount) {
        Transaction transaction = new Transaction();
        transaction.amount = amount;
        transaction.userName = currentCustomer.username;
        transaction.transactionID=currentCustomer.transactions.size()+1;
        currentCustomer.transactions.add(transaction);
        transaction.method="Credit Card Payment";
        return "Payment Done By Credit Card";
    }
}
