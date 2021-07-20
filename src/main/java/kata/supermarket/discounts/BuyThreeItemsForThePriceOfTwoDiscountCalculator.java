package kata.supermarket.discounts;

import kata.supermarket.Basket;

import java.math.BigDecimal;

public class BuyThreeItemsForThePriceOfTwoDiscountCalculator implements DiscountCalculator {

    private final Basket basket;

    public BuyThreeItemsForThePriceOfTwoDiscountCalculator(Basket basket) {
        this.basket = basket;
    }

    @Override
    public BigDecimal getDiscount() {
        return BigDecimal.ZERO;
    }
}
