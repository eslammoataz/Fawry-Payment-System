package Demo.VeiwRefunds;

import Demo.Payment.Transaction;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

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
}
