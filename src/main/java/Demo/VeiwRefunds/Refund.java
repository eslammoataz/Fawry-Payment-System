package Demo.VeiwRefunds;//package Demo.VeiwRefunds;
import java.util.ArrayList;
import Demo.Payment.Transaction;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Refund {
    String state;
    Transaction transaction;
//    ArrayList<Observer> ObserverList = new ArrayList<>();

    public Refund(Transaction t) {
        this.transaction = t;
    }

}
