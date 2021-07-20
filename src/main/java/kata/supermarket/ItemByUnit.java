package kata.supermarket;

import java.math.BigDecimal;

public class ItemByUnit implements Item {

    private final Product product;

    public ItemByUnit(final Product product) {
        this.product = product;
    }

    public String getId() {
        return product.getId();
    }

    public BigDecimal price() {
        return product.pricePerUnit();
    }
}
