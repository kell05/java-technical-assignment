# Notes

The purpose of this code was a technical test for Policy Expert.


### Design
* Top level class which encapsulates applying all discounts is kata.supermarket.discounts.CalculateTotalDiscounts
* CalculateTotalDiscounts applies individual discounts to the basket items
* Identification of Items which should be considered for discount are subclasses of ItemByWeight (KiloOfVegetablesForHalfPriceDiscountedItemByWeight) and ItemByUnit (BuyOneGetOneFreeDiscountedItemByUnit)



### Order of tasks undertaken

Breakdown of tasks in order 
1. Add Identification of Product.  This will allow is to apply the discounts based on the same Product or quantity of product(ItemByWeight)
1. Adding a sub class of each Item (ItemByUnit, ItemByWeight) in which to identify the products which are part of a specific discount.
1. Added specific DiscountsCalculations which can be applied to the basket item list
1. Create an iterable of all the code which calculates discounts to determine the total discount 


### Problems with the code
* Increasing information leak between the Product and Item based classes
* With the current code we cannot apply multiple discounts to the same products, which I believe is common in the USA.
* Ideally would have added some dependency injection to clean the code up further
* Lacking in tests.  I was aiming to show more of the arch of the design that I was creating and how that would be clean.
* Changed the visibility of the ItemByWeight and ItemByUnit code for ease of modification.  

### Terminology
This was for my benefit to understand the existing code.

Product - The item which can be purchased.  
Item - The quantity of the product the customer bought of the Product.


