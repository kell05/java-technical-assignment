package kata.supermarket;

import java.math.BigDecimal;

public class DiscountedItemByUnit extends ItemByUnit {

    private final String productId;

    DiscountedItemByUnit(String productId, Product product) {
        super(product);
        this.productId = productId;
    }
}

