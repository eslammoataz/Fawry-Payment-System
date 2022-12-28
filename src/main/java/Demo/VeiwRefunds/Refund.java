package Demo.VeiwRefunds;//package Demo.VeiwRefunds;
import java.util.ArrayList;
import Demo.Payment.Transaction;
import org.springframework.stereotype.Component;

@Component
public class Refund {
    public String state;
    public int am;
    Transaction transaction;
//    ArrayList<Observer> ObserverList = new ArrayList<>();

    public Refund(Transaction t) {
        this.transaction = t;
    }

}
