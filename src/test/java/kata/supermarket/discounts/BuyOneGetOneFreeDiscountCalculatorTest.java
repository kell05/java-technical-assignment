package kata.supermarket.discounts;

import kata.supermarket.*;
import kata.supermarket.discounts.items.BuyOneGetOneFreeDiscountedItemByUnit;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class BuyOneGetOneFreeDiscountCalculatorTest {


    @DisplayName("discount when applying buy one get one free containing...")
    @MethodSource
    @ParameterizedTest(name = "{0}")
    void basketTotalDiscount(String description, String expectedDiscount, Iterable<Item> items) {
        final Basket basket = new Basket();
        items.forEach(basket::add);
        assertEquals(new BuyOneGetOneFreeDiscountCalculator(basket).getDiscount(), new BigDecimal(expectedDiscount));
    }
    static Stream<Arguments> basketTotalDiscount() {
        return Stream.of(
                noItems(),
                oneDiscountItem(),
                twoDiscountItems(),
                twoDiscountItemsAndOneNonDiscount()
        );
    }

    private static Arguments noItems() {
        return Arguments.of("no items", "0.00", Collections.emptyList());
    }

    private static Arguments oneDiscountItem() {
        return Arguments.of("one buy one get one free milk", "0.00", Collections.singleton(buyOneGetOneFreeMilk()));
    }

    private static Arguments twoDiscountItems() {
        return Arguments.of("two buy one get one free milk", "0.49",  Arrays.asList(buyOneGetOneFreeMilk(), buyOneGetOneFreeMilk()));
    }


    private static Arguments twoDiscountItemsAndOneNonDiscount() {
        return Arguments.of("one buy one get one free milk and a non discount item", "0.49",
                Arrays.asList(buyOneGetOneFreeMilk(), buyOneGetOneFreeMilk(),twoHundredGramsOfPickAndMix())
        );
    }

    private static Item buyOneGetOneFreeMilk() {
        return new BuyOneGetOneFreeDiscountedItemByUnit(new Product("Milk", new BigDecimal("0.49")));
    }

    private static WeighedProduct aKiloOfPickAndMix() {
        return new WeighedProduct("PickAndMix", new BigDecimal("2.99"));
    }

    private static Item twoHundredGramsOfPickAndMix() {
        return aKiloOfPickAndMix().weighing(new BigDecimal("0.2"));
    }

}
