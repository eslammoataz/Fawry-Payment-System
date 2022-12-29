package Demo.AdminResponsabilities.Discount;

import Demo.DataBase;
import Demo.Users.Admin;
import Demo.Users.Customer;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
@Component
@Service
public class DiscountService {
    DataBase dataBase;

    public DiscountService(DataBase dataBase) {
        this.dataBase = dataBase;
    }
   public String addDiscount(String token , HashMap<String,String>input){
        Admin admin = dataBase.getAdminByToken(token);
        if(Objects.nonNull(admin)){
            Discount discount=null;
            double amount = Double.parseDouble(input.get("amount"));
            if(input.get("discountName").equals("Overall")){
                discount = new OverallDiscount(amount);
            }else if (input.get("discountName").equals("Specific"))
                discount = new SpecificDiscount(amount);
            dataBase.discounts.add(discount);
        }
       return "Discount added successfully";
   }
   public ArrayList<Discount> viewDiscounts(String token){
       Customer customer = dataBase.getCustomerByToken(token);
        return dataBase.discounts;
   }

}
