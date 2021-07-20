package kata.supermarket.discounts.items;

import kata.supermarket.ItemByWeight;
import kata.supermarket.WeighedProduct;

import java.math.BigDecimal;

public class KiloOfVegetablesForHalfPriceDiscountedItemByWeight extends ItemByWeight {


    public KiloOfVegetablesForHalfPriceDiscountedItemByWeight(WeighedProduct product, BigDecimal weightInKilos) {
        super(product, weightInKilos);
    }
}

