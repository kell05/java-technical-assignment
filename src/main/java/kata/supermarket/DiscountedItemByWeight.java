package kata.supermarket;

import java.math.BigDecimal;

public class DiscountedItemByWeight extends ItemByWeight {

    private final String productId;

    DiscountedItemByWeight(String productId, WeighedProduct product, BigDecimal weightInKilos) {
        super(product, weightInKilos);
        this.productId = productId;
    }

}

