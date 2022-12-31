package Demo.AdminResponsabilities.DealWithRefund;//package Demo.VeiwRefunds;

import Demo.DataBase;
import Demo.Payment.Transaction;
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
        char charindex = token.charAt(token.length() - 1);
        String indx = "" + charindex;
        Customer customer = dataBase.getCustomer(Integer.parseInt(indx));

        if (id > customer.transactions.size())
            return "No Transactions under this ID";
        Refund r = new Refund(customer.transactions.get(id - 1), dataBase.getRefundRequest().size() + 1);
        dataBase.addRefund(r);
        customer.refunds.add(r);
        return "Refund Request Done Successfully , now wait for approval";
    }

    public ArrayList<Refund> getRefundRequests(String token) {
        char charindex = token.charAt(token.length() - 1);
        String indx = "" + charindex;
        Admin admin = dataBase.getAdmin(Integer.parseInt(indx));
        if (Objects.nonNull(admin))
            return dataBase.getRefundRequest();
        return null;
    }

    public String refundDeal(String token, int id, String state) {
        char charindex = token.charAt(token.length() - 1);
        String indx = "" + charindex;
        Admin admin = dataBase.getAdmin(Integer.parseInt(indx));
        Refund r = dataBase.refundRequest.get(id);
        r.state = state;
        Customer customer = r.transaction.Customergetter();
        for (Refund r1 : customer.refunds) {
            if (r1.refundID == id) {
                r1.state = state;
                if (state.equals("accepted")) {
                    return "insider acc";
//                    Transaction t = r1.transactionGetter();
//                    t.amount *= -1;
//                    t.relatedService = "Fund request";
//                    ArrayList<Transaction> temp = customer.getTransactions();
                }
                return "inside refund only";
            }
//            return "Refund state updated to "+state;
        }
        return "Admin account error";
    }

    public ArrayList<Refund> customerGetRefunds(String token) {
        Customer customer = dataBase.getCustomerByToken(token);
        if (Objects.nonNull(customer))
            return customer.refunds;
        return null;
    }

    public ArrayList<Transaction> getCustomersTransactions(String token) {
        Admin admin = dataBase.getAdminByToken(token);
        return dataBase.usersTransactions;
    }

}
