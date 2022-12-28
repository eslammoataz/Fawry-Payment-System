package Demo.VeiwRefunds;
import java.util.ArrayList;
import Demo.Payment.Transaction;
import org.springframework.stereotype.Component;

@Component
public class Refund {
    String state;
    Transaction transaction;
//    ArrayList<Observer> ObserverList = new ArrayList<>();

    public Refund(Transaction t) {
        this.transaction = t;
    }

//    @Override
//    public void add(Observer observer) {
//        ObserverList.add(observer);
//    }

//    @Override
//    public void remove(Observer observer) {
//        ObserverList.remove(observer);
//    }
//
//    @Override
//    public void notifyAllObservers() {
//        for (Observer i : ObserverList) {
//            i.update(state);
//        }
//    }
}
