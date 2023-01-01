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
        String messege = "";
        if (dataBase.discounts.size() > 0) {
            for (var d : dataBase.discounts) {
                if (d instanceof OverallDiscount) {
                    amount -= d.getDiscountAmount();
                    messege += "Overall discount was added ";
                }
                if (d instanceof SpecificDiscount) {
                    if (d.getRelatedService().equals(serviceProvider.serviceName)) {
                        amount -= d.getDiscountAmount();
                        messege += "Specific discount was added ";
                    }
                }
            }
        }

        if (payment instanceof WalletPayment) {
            if (customer.wallet < amount)
                return "Not enough Wallet balance";
        }
        if (serviceProvider instanceof DonationService)
            if (input.get("donationReciver") == null)
                return "input error";

        if (serviceProvider instanceof VodafneMobileService)
            if (input.get("mobileNumber") == null)
                return "input error";

        if (serviceProvider instanceof OrangeMobileService)
            if (input.get("mobileNumber") == null)
                return "input error";

        if (serviceProvider instanceof WeMobileService)
            if (input.get("mobileNumber") == null)
                return "input error";

        if (serviceProvider instanceof EtisalatMobileService)
            if (input.get("mobileNumber") == null)
                return "input error";

        if (serviceProvider instanceof VodafoneInternetService)
            if (input.get("internetNumber") == null)
                return "input error";

        if (serviceProvider instanceof OrangeInternetService)
            if (input.get("internetNumber") == null)
                return "input error";

        if (serviceProvider instanceof WeInternetService)
            if (input.get("internetNumber") == null)
                return "input error";

        if (serviceProvider instanceof EtisalatInternetService)
            if (input.get("internetNumber") == null)
                return "input error";

        return messege + payment.pay(amount, customer, serviceProvider.serviceName) + " to " + input.get("ServiceProvider");
    }
}
