package kata.supermarket.discounts;


import kata.supermarket.Basket;
import kata.supermarket.Item;

import java.math.BigDecimal;
import java.util.List;

public class BuyThreeItemsForThePriceOfTwoDiscountCalculator implements DiscountCalculator {

    private final List<Item> items;

    public BuyThreeItemsForThePriceOfTwoDiscountCalculator(List<Item> items) {
        this.items = items;
    }

    @Override
    public BigDecimal getDiscount() {
        return BigDecimal.ZERO;
    }
}
