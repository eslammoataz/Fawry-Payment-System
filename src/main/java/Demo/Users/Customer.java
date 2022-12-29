package Demo.Users;
import Demo.Payment.Transaction;

import java.util.ArrayList;

public class Customer extends User {

    public double wallet = 0.0;
    //list transactions
    //list refunds
    public ArrayList<Transaction> transactions = new ArrayList<>();

    public Customer(String _email, String _userName, String _password) {
        this.email = _email;
        this.username = _userName;
        this.password = _password;
    }

//    public void viewDiscounts(DataBase dataBase) {
//        int c = 1;
//        for (Discount discount : dataBase.discounts) {
//            System.out.println(c + "- " + discount.getDiscountName() + " " + discount.getDiscountAmount());
//            c++;
//        }
//    }
//
//    public void refundRequest( DataBase dataBase) {
//        Refund refund = null;
//        int counter = 1;
//        if(transactions.size()==0){
//            System.out.println("NO Transactions done before");
//            return;
//        }
//        for (Transaction transaction : transactions) {
//            System.out.println("Transaction " + counter + " " + transaction.amount);
//            counter++;
//        }
//        int choice = 0;
//        System.out.println("choose trancation to do refund request");
//        choice = cin.nextInt();
//        for (Transaction transaction : transactions) {
//            choice--;
//            if (choice == 0) {
//                refund = new Refund(transaction);
//                refund.state = "pending";
//                break;
//            }
//        }
//        dataBase.refundRequest.add(refund);
//        System.out.println("Refund request completed");
//    }
//

//
//    @Override
//    public void update(String message) {
//        System.out.println("Customer " + userName + " Got New Notification about Refund ! : " + message);
//    }
}
