package Demo.AdminResponsabilities.Discount;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
public interface Discount {
    public void setDiscountAmount(Double discountAmount);

    public void setDiscountName(String discountName);

    public void setRelatedService(String relatedService);

    public String getRelatedService();

    public String getDiscountName();

    public Double getDiscountAmount();

    public Double setDiscountAmount(double discountAmount);

}
