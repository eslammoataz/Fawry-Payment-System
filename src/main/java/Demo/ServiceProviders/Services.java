package Demo.ServiceProviders;

import Demo.Payment.Payment;
import Demo.Users.Customer;
import org.springframework.stereotype.Component;

@Component
public abstract class Services {
    public int amount=50;
//    public void generateForm();

//    public String display(){
//        return "kareem amin";
//    }
    public abstract String pay(Payment payment , double amount , Customer customer ,String serviceName);

//    public void setForm();

//    public Double getAmount();
//
//    public void setAmount(Double amount);
//
//    public void viewServiceAmount();

}
