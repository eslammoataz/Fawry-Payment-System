package Demo.AdminResponsabilities.VeiwRefunds;

import Demo.Payment.Transaction;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@RestController

public class RefundController {
    RefundService refundService;

    public RefundController(RefundService refundService) {
        this.refundService = refundService;
    }

    @GetMapping("/makerefund/{id}")
    public String getTransactions(@RequestHeader("Authorization") String token, @PathVariable("id") int id){
        return refundService.doRefund(id , token);
    }
    @GetMapping("/viewrefundrequests")
    public ArrayList<Refund> viewRefundRequests(@RequestHeader("Authorization") String token){
        return refundService.getRefundRequests( token);
    }

    @GetMapping("/refund/{id}/{state}")
    public String DealwithRefund(@RequestHeader("Authorization") String token,@PathVariable("id") int id
            ,@PathVariable("state") String state){
        return refundService.refundDeal(token,id-1,state);
    }

    @GetMapping("/customer/refundrequests")
    public ArrayList<Refund> viewCustomerRefunds(@RequestHeader("Authorization") String token){
        return refundService.customerGetRefunds(token);
    }
    @GetMapping("/usersTransactions")
    public ArrayList<Transaction> getUsersTransactions(@RequestHeader("Authorization") String token){
        return refundService.getCustomersTransactions(token);
    }


}
