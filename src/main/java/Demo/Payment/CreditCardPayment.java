package Demo.Payment;
import static Demo.Login.LoginService.currentCustomer;
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
        return "Payment Done By Credit Card";
    }
}
