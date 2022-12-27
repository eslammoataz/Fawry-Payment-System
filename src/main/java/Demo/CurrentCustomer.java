package Demo;

import Demo.Users.Customer;

public class CurrentCustomer { // y3ml call ll service ely customer by3mlha
    public Customer customer;
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = new Customer(customer.email,customer.username,customer.password);
    }
}
