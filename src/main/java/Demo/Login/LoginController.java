package Demo.Login;

import Demo.Users.Admin;
import Demo.Users.Customer;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    LoginService service;


    public LoginController(LoginService service) {
        this.service = service;
    }
    @RequestMapping("/ok")
    public String okay(){
        return service.okay();
    }
    @RequestMapping(value = "/admin/register")
    public String adminregister(@RequestBody Admin admin){
        return service.registerAdmin(admin);
    }

    @RequestMapping(value = "/admin/login")
    public String adminlogin(@RequestBody Admin admin){
        return service.loginAdmin(admin);
    }

    @RequestMapping(value = "/customer/register")
    public String adminregister(@RequestBody Customer customer){
        return service.registerCustomer(customer);
    }

    @RequestMapping(value = "/customer/login")
    public String adminlogin(@RequestBody Customer customer){
        return service.loginCustomer(customer);
    }

}
