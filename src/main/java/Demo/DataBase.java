package Demo;
//import Demo.Users.Admin;
//import Demo.Users.Customer;

//import Demo.Users.Admin;
import Demo.AdminResponsabilities.Discount.Discount;
import Demo.Payment.Transaction;
import Demo.Users.Customer;
import org.springframework.stereotype.Component;
import Demo.Users.Admin;

import java.util.ArrayList;

import Demo.AdminResponsabilities.DealWithRefund.Refund;
@Component
public class  DataBase {
    static ArrayList<Admin> admins = new ArrayList<>();
    static ArrayList<Customer> customers = new ArrayList<>();
    static ArrayList<String> servicesNames = new ArrayList<>();
    public ArrayList<Discount> discounts = new ArrayList<>();
    static public ArrayList<Refund> refundRequest = new ArrayList<>();
    static  public ArrayList<Transaction> usersTransactions = new ArrayList<>();


    public DataBase() {
        servicesNames.add("Etisalat Mobile Services");
        servicesNames.add("Etisalat Internet Services");
        servicesNames.add("Vodafone Mobile Services");
        servicesNames.add("Vodafone Internet Services");
        servicesNames.add("WE Mobile Services");
        servicesNames.add("WE Internet Services");
        servicesNames.add("Orange Mobile Services");
        servicesNames.add("Orange Internet Services");
        servicesNames.add("Landline Montly Rciept");
        servicesNames.add("Landline Quarter Rciept");
        servicesNames.add("Donation Services");
    }

    //adding admins to the list of admins authorized
    public void addAdmin(Admin admin) {
        admins.add(admin);
    }

    public Boolean checkAdmin(Admin admin) {
        for (Admin value : admins)
            if (value.email.equals(admin.email) && value.password.equals(admin.password) &&
                    value.username.equals(admin.username))
                return true;
        return false;
    }

    public Boolean checkCustomer(Customer customer) {
        for (Customer value : customers)
            if (value.email.equals(customer.email) && value.password.equals(customer.password)
                    && value.username.equals(customer.username))
                return true;
        return false;
    }


    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public ArrayList<String> getServiceNames() {
        return servicesNames;
    }
    public void addRefund(Refund refund) {
        refundRequest.add(refund);
    }
    public ArrayList<Refund> getRefundRequest(){
        return refundRequest;
    }
    public String getTokenCustomer(Customer customer){
        int i=0;
        String messege=null;
        for (Customer value : customers){
            if (value.email.equals(customer.email) && value.password.equals(customer.password)
                    && value.username.equals(customer.username))
                messege="Customer-f2a294fa-0ecb-46c8-a439-f47125255608-"+i;
            i++;
        }
        return messege;
    }
    public String getTokenAdmin(Admin admin){
        int i=0;
        String messege=null;
        for (Admin value : admins){
            if (value.email.equals(admin.email) && value.password.equals(admin.password) &&
                    value.username.equals(admin.username))
                messege="Admin-f2a294fa-0ecb-46c8-a439-f47125255608-"+i;
            i++;
        }
        return messege;
    }

    public Customer getCustomerByToken(String token){
        //creating customer that will will work on
        char charindex =token.charAt(token.length()-1);
        String indx =""+charindex;
        Customer customer = getCustomer(Integer.parseInt(indx));
        return customer;
    }
    public Customer getCustomer(int index) {
        return customers.get(index);
    }
    public Admin getAdminByToken(String token){
        //creating customer that will will work on
        char charindex =token.charAt(token.length()-1);
        String indx =""+charindex;
        Admin admin = getAdmin(Integer.parseInt(indx));
        return admin;
    }
    public Admin getAdmin(int index) {
        return admins.get(index);
    }
    public int getCustomerID(Customer customer){
        int id=0;
        for (var c1 : customers){
            if (c1.email.equals(customer.email) && c1.password.equals(customer.password)
                    && c1.username.equals(customer.username))
                return id;
            id++;
        }
        return -1;
    }



}
