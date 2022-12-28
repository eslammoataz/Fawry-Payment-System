package Demo.VeiwRefunds;//package Demo.VeiwRefunds;

import Demo.DataBase;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

import static Demo.Authentication.AuthenticationSerivce.currentCustomer;
@Service
@Component
public class RefundService {
DataBase dataBase;

    public RefundService(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    public String doRefund(int id ) {
        if(id> currentCustomer.transactions.size())
            return "No Transactions under this ID";
        Refund  r = new Refund(currentCustomer.transactions.get(id-1));
        dataBase.addRefund(r);
        return "Refund Request Done Successfully , now wait for approval";
    }
    public ArrayList<Refund>getRefundRequests(){
        return dataBase.getRefundRequest();
    }
}
