package Demo.Discount;

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
public class SpecificDiscount implements Discount {
    public Double discountAmount = 0.5;
    public String discountName = "Specific Discount";

    public SpecificDiscount(Double discountAmount) {
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
