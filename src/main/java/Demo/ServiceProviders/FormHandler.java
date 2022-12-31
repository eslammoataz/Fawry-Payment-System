//package Demo.ServiceProviders;
//import java.util.Map;
//import java.util.Scanner;
//
//public class FormHandler {
//    Form form;
//    Services service;
//    Payment payment;
//    Customer customer;
//    Double amountEntered;
//    Transaction transaction;
//    DataBase dataBase = null;
//    Scanner cin = new Scanner(System.in);
//
//    public FormHandler(Customer customer, Services service, Form form , DataBase dataBase) {
//        this.service = service;
//        this.form = form;
//        setPayment(form);
//        amountEntered = Double.parseDouble(form.attr.get("Amount"));
//        this.customer = customer;
//        transaction = new Transaction();
//        this.dataBase = dataBase;
//        transaction.userName = customer.userName;
//    }
//
//    void setPayment(Form form) {
//        if (form.wayOfPayment.equals("Credit Card") || form.wayOfPayment.equals("1"))
//            payment = new CreditCardPayment();
//        else if (form.wayOfPayment.equals("Wallet")|| form.wayOfPayment.equals("2"))
//            payment = new WalletPayment();
//        else payment = new CashPayment();
//    }
//    void addtoWallet(){
//        customer.wallet+=amountEntered;
//    }
//
//    void proccessInformation() {
//        String exit = "1";
//        if (payment instanceof WalletPayment) {
//            if (amountEntered > customer.wallet) {
//                System.out.println("Not Enough Wallet Money :(\n 1.Pay with another method \n2. Exit");
//                exit = cin.next();
//                if (exit.equals("1")){
//                    form.paymentMethod();
//                    setPayment(form);
//                }else  System.exit(0);
//            }
//        }
//        System.out.println("Confirmation");
//        for (Map.Entry<String, String> mapElement : form.attr.entrySet()) {
//            String key = mapElement.getKey();
//            String value = (mapElement.getValue());
//            System.out.println(key + " : " + value);
//        }
//        int agree = -1;
//        System.out.println("1.Confirm\n2.Decline");
//        agree = cin.nextInt();
//        if (agree == 2) {
//            System.out.println("Try another Time");
//            System.exit(0);
//        }
//        transaction=payment.pay(customer,amountEntered);
//        customer.transactions.add(transaction);
////        System.exit(0);
//    }
//
//
//}
