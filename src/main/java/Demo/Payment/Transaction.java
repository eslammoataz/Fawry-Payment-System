package Demo.Payment;

import Demo.Users.Customer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
public class Transaction {
    public double amount;
    public String method;
    public int transactionID;

    Customer customer;

    public Customer Customergetter() {
        return customer;
    }
}
