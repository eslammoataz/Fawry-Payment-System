package Demo.AdminResponsabilities.DealWithRefund;//package Demo.VeiwRefunds;

import Demo.Payment.Transaction;
import Demo.Users.Admin;
import Demo.Users.Customer;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Objects;

import static Demo.Authentication.AuthenticationSerivce.dataBase;

@Service
@Component
public class RefundService {
//    DataBase dataBase;

//    public RefundService(DataBase dataBase) {
//        this.dataBase = dataBase;
//    }

    public String doRefund(int id, String token) {
        char charindex = token.charAt(token.length() - 1);
        String indx = "" + charindex;
        Customer customer = dataBase.getCustomer(Integer.parseInt(indx));
        if (id > customer.transactions.size())
            return "No Transactions under this ID";
        Refund r = new Refund(customer.getTransactionsbyID(id - 1), dataBase.getRefundRequest().size() + 1);
        r.customerID = dataBase.getCustomerID(customer);
        customer.refunds.add(r);
        dataBase.addRefund(r);
        return "Refund Request Done Successfully , now wait for approval";
    }

    public ArrayList<Refund> getRefundRequests(String token) {
        char charindex = token.charAt(token.length() - 1);
        String indx = "" + charindex;
        Admin admin = dataBase.getAdmin(Integer.parseInt(indx));
        if (Objects.nonNull(admin)) {
            ArrayList<Refund> r = dataBase.getRefundRequest();
            return r;
        }

        return null;
    }

    public String refundDeal(String token, int id, String state) {
        Admin admin = dataBase.getAdminByToken(token);
        if (admin == null)
            return "Admin account error";
        if(id>dataBase.refundRequest.size())
            return"Refund id not found";
        Refund r = dataBase.refundRequest.get(id - 1);
        r.state = state;
        Customer customer = dataBase.getCustomer(r.customerID);
        if (state.equals("accepted")) {
            Transaction t = new Transaction();
            t.amount=r.transaction.amount;
            t.transactionID=customer.transactions.size()+1;
            t.customerID=r.transaction.customerID;
            t.method=r.transaction.method;
            t.amount *= -1;
            t.relatedService = "Fund request";
            customer.transactions.add(t);
        }
        return "Refund state updated to " + state;
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
