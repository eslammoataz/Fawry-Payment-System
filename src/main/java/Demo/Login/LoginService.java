package Demo.Login;

import Demo.DataBase;
import Demo.Users.Admin;
import Demo.Users.Customer;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class LoginService {
    DataBase dataBase;
    public static Customer currentCustomer;

    public LoginService(DataBase database) {
        this.dataBase = database;
    }


    public String loginAdmin(Admin admin) {
        Boolean ok = dataBase.checkAdmin(admin);

        if(ok){
//            currentAdmin.setAdmin(admin);
            return "Admin logged succefully";
        }
        return "No such Admin Account , Check your inputs";
    }

    public String registerAdmin(Admin admin) {
        Boolean ok = dataBase.checkAdmin(admin);
        if (!ok) {
            dataBase.addAdmin(admin);
            return "Admin registered succefully";
        }
        return "Admin account already Exists ";
    }

    public String okay(){
        return "Handshake";
    }


    public String loginCustomer(Customer customer) {
        Boolean ok = dataBase.checkCustomer(customer);
        if(ok){
            currentCustomer = dataBase.getCustomer(customer);
            return "Customer logged succefully";
        }
        return "No such Customer Account , Check your inputs";

    }

    public String registerCustomer(Customer customer) {
        Boolean ok = dataBase.checkCustomer(customer);
        if (!ok) {
            dataBase.addCustomer(customer);
             return "Customer registered succefully";
        }
        return "Customer account already Exists ";
    }

}
