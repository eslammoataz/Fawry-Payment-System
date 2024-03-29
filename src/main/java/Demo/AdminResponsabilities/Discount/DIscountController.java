package Demo.AdminResponsabilities.Discount;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
@RestController
public class DIscountController {
    DiscountService service;

    public DIscountController(DiscountService service) {
        this.service = service;
    }
    @PostMapping("/addiscount")
    public String addDiscount(@RequestHeader("Authorization") String token,@RequestBody HashMap<String,String>input){
        return service.addDiscount(token,input);
    }

    @GetMapping("/viewdiscount")
    public ArrayList<Discount> addDiscount(@RequestHeader("Authorization") String token){
        return service.viewDiscounts(token);
    }

}
