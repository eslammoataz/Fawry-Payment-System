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

    public Customer customer;

    public void setCustomer(Customer customer) {
        this.customer = new Customer(customer.email,customer.username,customer.password);
    }

    public Customer Customergetter() {
        return customer;
    }
}
