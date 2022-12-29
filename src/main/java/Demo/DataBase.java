package Demo;
//import Demo.Users.Admin;
//import Demo.Users.Customer;

//import Demo.Users.Admin;
import Demo.Users.Customer;
import Demo.Users.User;
import org.springframework.stereotype.Component;
import Demo.Users.Admin;

import java.lang.reflect.GenericDeclaration;
import java.util.ArrayList;
import java.util.Objects;

import Demo.VeiwRefunds.Refund;
@Component
public class DataBase {
    ArrayList<Admin> admins = new ArrayList<>();
    ArrayList<Customer> customers = new ArrayList<>();
    ArrayList<String> servicesNames = new ArrayList<>();
//    ArrayList<Discount> discounts = new ArrayList<>();
    public ArrayList<Refund> refundRequest = new ArrayList<>();


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

    public Customer getCustomer(int index) {
        return customers.get(index);
    }
    public Admin getAdmin(int index) {
        return admins.get(index);
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
                messege="Db/Customerlogin/Authen/token=154?#2%3-"+i;
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
                messege="Db/Adminlogin/Authen/token=154?#2%131-"+i;
            i++;
        }
        return messege;
    }


//    public Admin setAdmin(String email,String password) {
//        Admin tempAdmin = null;
//        for (Admin value : admins)
//            if (value.email.equals(email) && value.password.equals(password))
//                tempAdmin = value;
//        return tempAdmin;
//    }
//
//

//

//    public Customer getCustomer(String email, String password) {
//        Customer c = null;
//        for (Customer value : customers)
//            if (value.email.equals(email) && value.password.equals(password))
//                c= value;
//        return c;
//    }
//    public Admin getAdmin(String email, String password) {
//        Admin c = null;
//        for (Admin value : admins)
//            if (value.email.equals(email) && value.password.equals(password))
//                c= value;
//        return c;
//    }
//    public void addDiscount(Discount discount) {
//        discounts.add(discount);
//    }

}
