package Demo.ServiceProviders;

import Demo.Payment.Payment;

public class EtisalatMobileService extends Services{
//    @Override
//    public void generateForm() {
//
//    }

    public EtisalatMobileService() {
        super.amount=45;
    }

    @Override
    public String pay(Payment payment , double _amount) {
        return payment.pay(_amount);
    }
}
