package Demo.Payment;
import static Demo.Login.LoginService.currentCustomer;
public class CreditCardPayment implements Payment{
    String cardNumber;
    String cvv;
    double amount;

    public CreditCardPayment(String cardNumber, String cvv, double amount) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.amount = amount;
    }

    @Override
    public Transaction pay( double amount) {
        Transaction transaction = new Transaction();
        System.out.println("Transaction Done Successfully by Credit Card");
        transaction.amount = amount;
        transaction.userName = currentCustomer.username;
        return transaction;
    }
}
