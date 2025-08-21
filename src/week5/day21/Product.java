package week5.day21;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    private Integer pno;
    private String pName;
    private String pCompany;
    private Integer price;
}
