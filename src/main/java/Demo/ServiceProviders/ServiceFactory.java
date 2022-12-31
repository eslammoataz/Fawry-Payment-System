package Demo.ServiceProviders;

import org.springframework.stereotype.Component;

import java.util.Scanner;
@Component
public class ServiceFactory {
    Scanner cin = new Scanner(System.in);

    public Services create(String choice) { // choice = service name
        Services service = null;
        if (choice.equals("Etisalat Mobile Services"))
                service = new EtisalatMobileService();
        if (choice.equals("Etisalat Internet Services")) // etisalat mobile
            service = new EtisalatInternetService();
        if (choice.equals("Vodafone Mobile Services")) // vodafone internet
            service = new VodafneMobileService();
        if (choice.equals("Vodafone Internet Services")) // vodafone mobile
            service = new VodafoneInternetService();
        if (choice.equals("WE Mobile Services")) // we mobile
            service = new WeMobileService();
        if (choice.equals("WE Internet Services")) // we internet
            service = new WeInternetService();
        if (choice.equals("Orange Mobile Services")) // orange internet
            service = new OrangeMobileService();
        if (choice.equals("Orange Internet Services")) // orange mobile
            service = new OrangeInternetService();
        if (choice.equals("Landline Montly Rciept")) // landlinequarter
            service = new LandlineMonthlyRecipetService();
        if (choice.equals("Landline Quarter Rciept")) // landline month
            service = new LandlineQuarterRecieptService();
        if (choice.equals("Donation Services")) // donations
            service = new DonationService();
        return service;
    }
}
