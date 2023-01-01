package Demo.Payment;

import Demo.ServiceProviders.Services;
import Demo.Users.Customer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.security.PublicKey;

@Component
public class Transaction {
    public double amount;
    public String method;
    public int transactionID;

    public int customerID;
    public String relatedService;

}
