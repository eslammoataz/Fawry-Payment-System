package Demo.ServiceProviders;

import Demo.Payment.Payment;
import org.springframework.stereotype.Component;

@Component
public abstract class Services {
    public int amount=50;
//    public void generateForm();

//    public String display(){
//        return "kareem amin";
//    }
    public abstract String pay(Payment payment , double amount);

//    public void setForm();

//    public Double getAmount();
//
//    public void setAmount(Double amount);
//
//    public void viewServiceAmount();

}
