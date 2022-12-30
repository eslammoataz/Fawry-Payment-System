package Demo.ServiceProviders;

import Demo.Payment.Payment;
import Demo.Users.Customer;
import org.springframework.stereotype.Component;

@Component
public class EtisalatMobileService extends Services{
//    @Override
//    public void generateForm() {
//
//    }

    public EtisalatMobileService() {
        super.amount=45;
    }

    @Override
    public String servicePay(Payment payment, double _amount, Customer customer, String serviceName){
        return payment.pay(_amount ,customer,serviceName);
    }

}
