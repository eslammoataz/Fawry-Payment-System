package Demo.Users;
import Demo.Payment.Transaction;
import Demo.AdminResponsabilities.DealWithRefund.Refund;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Customer extends User {

    public double wallet = 0.0;
    //list transactions
    //list refunds
    public ArrayList<Transaction> transactions = new ArrayList<>();
    public ArrayList<Refund> refunds = new ArrayList<>();

    public Customer(String _email, String _userName, String _password) {
        this.email = _email;
        this.username = _userName;
        this.password = _password;
    }

    public double getWallet() {
        return wallet;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public ArrayList<Refund> getRefunds() {
        return refunds;
    }

}
