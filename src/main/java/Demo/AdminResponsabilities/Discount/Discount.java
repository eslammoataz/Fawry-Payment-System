package Demo.AdminResponsabilities.Discount;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
public interface Discount {
    public String getDiscountName();
    public Double getDiscountAmount();

}
