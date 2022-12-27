package Demo;
//import Demo.Users.Admin;
//import Demo.Users.Customer;
import Demo.Users.Admin;
import Demo.Users.Customer;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Scanner;

@Component
public class DataBase {
    ArrayList<Admin> admins = new ArrayList<>();
    ArrayList<Customer> customers = new ArrayList<>();
//    ArrayList<Discount> discounts = new ArrayList<>();
//    ArrayList<Refund> refundRequest = new ArrayList<>();
    Scanner cin = new Scanner(System.in);
    public DataBase(){
    }




    //adding admins to the list of admins authorized
    public void addAdmin(Admin admin) {
        admins.add(admin);
    }

    public Boolean checkAdmin(Admin admin) {
        for (Admin value : admins)
            if (value.email.equals(admin.email) && value.password.equals(admin.password) &&
                    value.username.equals(admin.username) )
                return true;
        return false;
    }

    public Boolean checkCustomer(Customer customer) {
        for (Customer value : customers)
            if (value.email.equals(customer.email) && value.password.equals(customer.password)
                    &&value.username.equals(customer.username) )
                return true;
        return false;
    }
    public Customer getCustomer(Customer customer){
        Customer customer1 = null;
        for (Customer value : customers)
            if (value.email.equals(customer.email) && value.password.equals(customer.password)
                    &&value.username.equals(customer.username) )
                 customer1=value;
        return customer1;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
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
