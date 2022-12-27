package Demo.Login;

import Demo.CurrentAdmin;
import Demo.CurrentCustomer;
import Demo.DataBase;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class LoginService {
    DataBase dataBase;
//    CurrentAdmin currentAdmin;
//    public CurrentCustomer currentCustomer;

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
//            currentCustomer.setCustomer(customer);
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
