package kata.supermarket;


import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Discounted {


    @Test
    public void testFoo() {

        Item weighedProduct = new WeighedProduct("Rice", new BigDecimal(1.0)).weighing(new BigDecimal(2.0));
        final Item weighedItem = weighedProduct;
//
//        new DiscountedItemByUnit(new Product("Milk", new BigDecimal("0.49")),
//        new DiscountedItemByWeight("Rice", )


//        List<Item> test = Arrays.asList(
//
//        );
//
//
//        for(Item item : test){
//            if (item instanceof DiscountedItemByUnit) {
//                System.out.println("Unit");
//            }
//            if (item instanceof DiscountedItemByUnit){
//                System.out.println("Weight");
//        }


    }


}
