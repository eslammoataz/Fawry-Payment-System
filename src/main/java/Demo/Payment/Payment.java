package Demo.Payment;

import Demo.Users.Customer;

public interface Payment {
     String pay(double amount , Customer customer , String serviceName);

}
