package Demo.ServiceProviders;

import Demo.AdminResponsabilities.Discount.OverallDiscount;
import Demo.AdminResponsabilities.Discount.SpecificDiscount;
import Demo.Payment.Payment;
import Demo.Payment.WalletPayment;
import Demo.Users.Customer;
import org.springframework.stereotype.Component;
import static Demo.Authentication.AuthenticationSerivce.dataBase;

import java.util.Map;
@Component
public class FormHandler {
    public String paymentHandling(Map<String, String> input, Services serviceProvider, Payment payment, Customer customer) {
        double amount = Double.parseDouble(input.get("amount"));
        if (payment instanceof WalletPayment) {
            if (customer.wallet < amount)
                return "Not enough Wallet balance";
        }
        String messege="";
        if(dataBase.discounts.size()>0){
            for(var d : dataBase.discounts){
                if(d instanceof OverallDiscount){
                    amount-=d.getDiscountAmount();
                    messege="Overall discount was added ";
                }
                if(d instanceof SpecificDiscount ){
                    if(d.getRelatedService().equals(serviceProvider.serviceName)){
                        amount-=d.getDiscountAmount();
                        messege="Specific discount was added ";
                    }
                }
            }
        }
        if (serviceProvider instanceof DonationService)
            ((DonationService) serviceProvider).donationReciever = input.get("donationReciver");
        if (serviceProvider instanceof VodafneMobileService)
            ((VodafneMobileService) serviceProvider).mobileNumber = input.get("mobileNumber");
        if (serviceProvider instanceof OrangeMobileService)
            ((OrangeMobileService) serviceProvider).mobileNumber = input.get("mobileNumber");
        if (serviceProvider instanceof WeMobileService)
            ((WeMobileService) serviceProvider).mobileNumber = input.get("mobileNumber");
        if (serviceProvider instanceof EtisalatMobileService)
            ((EtisalatMobileService) serviceProvider).mobileNumber = input.get("mobileNumber");
        if (serviceProvider instanceof VodafoneInternetService)
            ((VodafoneInternetService) serviceProvider).internetNumber = input.get("internetNumber");
        if (serviceProvider instanceof OrangeInternetService)
            ((OrangeInternetService) serviceProvider).internetNumber = input.get("internetNumber");
        if (serviceProvider instanceof WeInternetService)
            ((WeInternetService) serviceProvider).internetNumber = input.get("internetNumber");
        if (serviceProvider instanceof EtisalatInternetService)
            ((EtisalatInternetService) serviceProvider).internetNumber = input.get("internetNumber");

        return messege+payment.pay(amount, customer, serviceProvider.serviceName)+" to "+input.get("ServiceProvider");
    }
}
