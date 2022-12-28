package Demo.VeiwRefunds;

import Demo.Payment.Transaction;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController

public class RefundController {
    RefundService refundService;

    public RefundController(RefundService refundService) {
        this.refundService = refundService;
    }

    @GetMapping("/makerefund/{id}")
    public String getTransactions(@PathVariable("id") int id){
        return refundService.doRefund(id);
    }
}
