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

    public OverallDiscount(Double discountAmount) {
        this.discountAmount = discountAmount;
    }

    @Override
    public String getDiscountName() {
        return discountName;
    }

    @Override
    public Double getDiscountAmount() {
        return discountAmount;
    }
}
