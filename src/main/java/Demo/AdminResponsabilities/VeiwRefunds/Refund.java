package Demo.AdminResponsabilities.VeiwRefunds;//package Demo.VeiwRefunds;
import Demo.Payment.Transaction;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;
//making setter and geter so spring can access to log it on screen
@Component
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Refund {
    String state = "Pending";
    Transaction transaction;
    int refundID;

    public Refund(Transaction t , int refundID) {
        this.transaction = t;
        this.refundID = refundID;
    }

}
