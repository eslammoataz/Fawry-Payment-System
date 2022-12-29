package Demo.Authentication;

import Demo.Users.Admin;
import Demo.Users.Customer;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthenticationController {
    AuthenticationSerivce service;


    public AuthenticationController(AuthenticationSerivce service) {
        this.service = service;
    }
    @RequestMapping("/ok")
    public String okay(){
        return service.okay();
    }
    @PostMapping(value = "/admin/register")
    public String adminregister(@RequestBody Admin admin){
        return service.registerAdmin(admin);
    }

    @RequestMapping(value = "/admin/login")
    public String adminlogin(@RequestBody Admin admin){
        return service.loginAdmin(admin);
    }

    @PostMapping(value = "/customer/register")
    public String customerRegister(@RequestBody Customer customer){
        return service.registerCustomer(customer);
    }

    @RequestMapping(value = "/customer/login")
    public String customerLogin(@RequestBody Customer customer){
        return service.loginCustomer(customer);
    }
    @RequestMapping(value = "/signout")
    public String signout(){
       return service.signout();
    }

}
