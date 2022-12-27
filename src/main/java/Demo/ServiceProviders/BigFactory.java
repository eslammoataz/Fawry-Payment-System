package Demo.ServiceProviders;

import org.springframework.stereotype.Component;

import java.util.Scanner;
@Component
public class BigFactory {
    Scanner cin = new Scanner(System.in);

    public Services create(String choice) { // choice = service name
        Services service = null;
        if (choice.equals("EtisalatInternetService"))
                service = new EtisalatInternetService();
//        if (choice.equals("2")) // etisalat mobile
//            service = new EtisalatInternetService();
//        if (choice.equals("3")) // vodafone internet
//            service = new EtisalatInternetService();
//        if (choice.equals("4")) // vodafone mobile
//            service = new EtisalatInternetService();
//        if (choice.equals("5")) // we mobile
//            service = new EtisalatInternetService();
//        if (choice.equals("6")) // we internet
//            service = new EtisalatInternetService();
//        if (choice.equals("7")) // orange internet
//            service = new EtisalatInternetService();
//        if (choice.equals("8")) // orange mobile
//            service = new EtisalatInternetService();
//        if (choice.equals("9")) // landlinequarter
//            service = new EtisalatInternetService();
//        if (choice.equals("10")) // landline month
//            service = new EtisalatInternetService();
//        if (choice.equals("11")) // donations
//            service = new EtisalatInternetService();

        return service;
    }
}
