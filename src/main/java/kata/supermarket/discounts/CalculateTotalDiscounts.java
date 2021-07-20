package kata.supermarket.discounts;


import kata.supermarket.Item;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;


public class CalculateTotalDiscounts implements DiscountCalculator {

    private final List<Item> items;
    private final List<DiscountCalculator> discounts;


    public CalculateTotalDiscounts(List<Item> items) {
        this.items = items;

        this.discounts = Arrays.asList(
                new BuyThreeItemsForThePriceOfTwoDiscountCalculator(this.items),
                new BuyOneGetOneFreeDiscountCalculator(this.items)
        );
    }

    public CalculateTotalDiscounts(List<Item> items, List<DiscountCalculator> discounts) {
        this.items = items;
        this.discounts = discounts;
    }

    @Override
    public BigDecimal getDiscount() {
        BigDecimal total = BigDecimal.ZERO;
        for (DiscountCalculator discountCalculator : this.discounts) {
            total = total.add(discountCalculator.getDiscount());
        }
        return total;
    }
}
