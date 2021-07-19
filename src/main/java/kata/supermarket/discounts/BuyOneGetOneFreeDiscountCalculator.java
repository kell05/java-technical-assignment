package kata.supermarket.discounts;

import kata.supermarket.Basket;

import java.math.BigDecimal;

/**
 * Calculates the discount of all buy one get one free items in basket
 * Applied to unit priced items.
 */
public class BuyOneGetOneFreeDiscountCalculator implements DiscountCalculator {

    private final Basket basket;

    public BuyOneGetOneFreeDiscountCalculator(Basket basket) {
        this.basket = basket;
    }

    @Override
    public BigDecimal getDiscount() {
        return BigDecimal.ZERO;
    }
}
