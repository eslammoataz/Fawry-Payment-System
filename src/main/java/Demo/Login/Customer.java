package Demo.Login;

import java.util.Scanner;


public class Customer implements User{

    public double wallet = 200;
//    Scanner cin = new Scanner(System.in);
    //list transactions
    //list refunds
    public String email;
    public  String username;
    public  String password;
//    ArrayList<Transaction> transactions = new ArrayList<>();

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
//    public void walletFund() {
//        System.out.println("Amount you want to add to your wallet");
//        Double amount = cin.nextDouble();
//        System.out.println("Choose way of payment \n1.Credit Card  \n2.Cash");
//        String choice = cin.next();
//        Payment payment = null;
//        if (choice.equals("1"))
//            payment = new CreditCardPayment();
//        else payment = new CashPayment();
//        payment.pay(this,amount);
//        this.wallet+=amount;
//        System.out.println("Wallet Amount is "+wallet);
//    }
//
//    @Override
//    public void update(String message) {
//        System.out.println("Customer " + userName + " Got New Notification about Refund ! : " + message);
//    }
}
