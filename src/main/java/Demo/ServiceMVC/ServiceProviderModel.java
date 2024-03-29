package Demo.ServiceMVC;

import Demo.DataBase;
import Demo.Payment.Payment;
import Demo.Payment.PaymentFactory;
import Demo.Payment.Transaction;
import Demo.ServiceProviders.FormHandler;
import Demo.ServiceProviders.ServiceFactory;
import Demo.ServiceProviders.Services;
import Demo.Users.Customer;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Map;

@Component
@Service
public class ServiceProviderModel {
    Services serviceProvider;
    ServiceFactory factory;
    PaymentFactory paymentFactory;
    DataBase dataBase;

    public ServiceProviderModel(ServiceFactory factory , DataBase dataBase) {
        this.factory = factory;
        this.dataBase=dataBase;
        this.paymentFactory = new PaymentFactory();
    }

    public String pay(Map<String,String>input , String token) {
        //creating customer that will will work on
        Customer customer = dataBase.getCustomerByToken(token);
        serviceProvider = factory.create(input.get("ServiceProvider"));
        serviceProvider.setFormHandler(new FormHandler());
        Payment payment = paymentFactory.create(input.get("paymentmethod"),input);
        return serviceProvider.servicePay(payment, customer, serviceProvider, input);
    }

    public double getServiceAmount(Map<String, String> input) {
            serviceProvider = factory.create(input.get("ServiceProvider"));
        return serviceProvider.amount;
    }

    public ArrayList<Transaction> getTransaction(String token){
        //creating customer that will will work on
        Customer customer = dataBase.getCustomerByToken(token);
        return customer.transactions;
    }
    public ArrayList<String> getSerivcesNames(){
        return dataBase.getServiceNames();
    }



}
