package kata.supermarket.discounts;

import kata.supermarket.Basket;
import kata.supermarket.discounts.DiscountCalculator;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Calculates the discount of all buy one get one free items in basket
 * Applied to unit priced items.
 */
public class BuyOneGetOneFreeDiscountCalculator implements DiscountCalculator {

    private final Basket basket;

    BuyOneGetOneFreeDiscountCalculator(Basket basket) {
        this.basket = basket;
    }

    @Override
    public BigDecimal getDiscount() {
        return BigDecimal.ZERO;
    }
}
