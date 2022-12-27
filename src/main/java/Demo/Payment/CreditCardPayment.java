package Demo.Payment;
import static Demo.Login.LoginService.currentCustomer;
public class CreditCardPayment implements Payment{
    String cardNumber;
    String cvv;
    public double amount;

    public CreditCardPayment(String cardNumber, String cvv, double amount) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.amount = amount;
    }

    @Override
    public String pay( double amount) {
        if(this.amount < amount)
            return "Not enough balance";
        Transaction transaction = new Transaction();
        transaction.amount = amount;
        transaction.userName = currentCustomer.username;
        this.amount-=amount;
        return "Payment Done By Credit Card";
    }
}
