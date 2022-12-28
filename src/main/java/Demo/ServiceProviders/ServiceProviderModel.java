package Demo.ServiceProviders;

import Demo.DataBase;
import Demo.Payment.Payment;
import Demo.Payment.PaymentFactory;
import Demo.Payment.Transaction;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import static Demo.Authentication.AuthenticationSerivce.currentCustomer;

import java.util.ArrayList;
import java.util.Map;

@Component
@Service
public class ServiceProviderModel {
    Services serviceProvider;
    BigFactory factory;
    PaymentFactory paymentFactory;
    DataBase dataBase;

    public ServiceProviderModel(BigFactory factory , DataBase dataBase) {
        this.factory = factory;
        this.dataBase=dataBase;
        this.paymentFactory = new PaymentFactory();
    }

    public String pay(Map<String,String>input) {
        serviceProvider = factory.create(input.get("ServiceProvider"));
        Payment payment = paymentFactory.create(input.get("paymentmethod"),input);
        return serviceProvider.pay(payment, Double.parseDouble(input.get("amount")))+" to "+input.get("ServiceProvider");
    }

    public double getServiceAmount(Map<String, String> input) {
            serviceProvider = factory.create(input.get("ServiceProvider"));
        return serviceProvider.amount;
    }

    public ArrayList<Transaction> getTransaction(){
        return currentCustomer.transactions;
    }
    public ArrayList<String> getSerivcesNames(){
        return dataBase.getServiceNames();
    }


}
