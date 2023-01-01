package Demo.AdminResponsabilities.Discount;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OverallDiscount implements Discount {


    public Double discountAmount = 0.75;
    public String discountName = "Overall Discount";
    String relatedService = "AllServices";

    public void setDiscountAmount(Double discountAmount) {
        this.discountAmount = discountAmount;
    }

    public void setDiscountName(String discountName) {
        this.discountName = discountName;
    }

    public void setRelatedService(String relatedService) {
        this.relatedService = relatedService;
    }

    public String getRelatedService() {
        return relatedService;
    }

    @Override
    public String getDiscountName() {
        return discountName;
    }

    @Override
    public Double getDiscountAmount() {
        return discountAmount;
    }

    @Override
    public Double setDiscountAmount(double discountAmount) {
        return this.discountAmount =discountAmount;
    }
}
