package kata.supermarket.discounts;

import kata.supermarket.Basket;
import kata.supermarket.Item;
import kata.supermarket.discounts.DiscountCalculator;
import kata.supermarket.discounts.items.BuyOneGetOneFreeDiscountedItemByUnit;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Calculates the discount of all buy one get one free items in basket
 * Applied to unit priced items.
 */
public class BuyOneGetOneFreeDiscountCalculator implements DiscountCalculator {

    private final List<Item> items;

    BuyOneGetOneFreeDiscountCalculator(List<Item> items) {
        this.items = items;
    }

    @Override
    public BigDecimal getDiscount() {
        // TODO: Calculate based on items being BuyOneGetOneFreeDiscountedItemByUnit

        for (Item i : items){
            if (i instanceof BuyOneGetOneFreeDiscountedItemByUnit){
                System.out.println("Do calculation");
            }
        }
        return BigDecimal.ZERO;
    }
}
