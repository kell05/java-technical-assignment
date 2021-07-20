package kata.supermarket.discounts;

import kata.supermarket.Item;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CalculateTotalDiscountsTest {

    private class FirstCalculator implements DiscountCalculator {
        @Override
        public BigDecimal getDiscount() {
            return new BigDecimal("1.0");
        }
    }

    private class SecondCalculator implements DiscountCalculator {
        @Override
        public BigDecimal getDiscount() {
            return new BigDecimal("2.0");
        }
    }

    private final List<Item> items = Collections.emptyList();

    @Test
    public void testTotalCalculationOfDiscount() {
        List<DiscountCalculator> discountCalculatorList = Arrays.asList(
                new FirstCalculator(),
                new SecondCalculator()
        );
        DiscountCalculator totalDiscountCalculator = new CalculateTotalDiscounts(items, discountCalculatorList);
        assertEquals(totalDiscountCalculator.getDiscount(), new BigDecimal("3.0"));


    }


}
