package Demo.Payment;

import Demo.ServiceProviders.Services;
import Demo.Users.Customer;

public interface Payment {
     String pay(double amount , Customer customer , String relatedService);

}

