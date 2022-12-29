package Demo.VeiwRefunds;//package Demo.VeiwRefunds;

import Demo.DataBase;
import Demo.Users.Admin;
import Demo.Users.Customer;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Objects;


@Service
@Component
public class RefundService {
    DataBase dataBase;

    public RefundService(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    public String doRefund(int id, String token) {
        char charindex =token.charAt(token.length()-1);
        String indx =""+charindex;
        Customer customer = dataBase.getCustomer(Integer.parseInt(indx));

        if (id > customer.transactions.size())
            return "No Transactions under this ID";
        Refund r = new Refund(customer.transactions.get(id - 1));
        dataBase.addRefund(r);
        return "Refund Request Done Successfully , now wait for approval";
    }

    public ArrayList<Refund> getRefundRequests(String token) {
        char charindex =token.charAt(token.length()-1);
        String indx =""+charindex;
        Admin admin = dataBase.getAdmin(Integer.parseInt(indx));
        if(Objects.nonNull(admin))
             return dataBase.getRefundRequest();
        return null;
    }
}
