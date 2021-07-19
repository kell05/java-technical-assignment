package kata.supermarket;

import java.math.BigDecimal;

public class WeighedProduct {

    private final String id;
    private final BigDecimal pricePerKilo;

    public WeighedProduct(final String id, final BigDecimal pricePerKilo) {
        this.id = id;
        this.pricePerKilo = pricePerKilo;
    }

    public String getId() {
        return this.id;
    }

    BigDecimal pricePerKilo() {
        return pricePerKilo;
    }

    public Item weighing(final BigDecimal kilos) {
        return new ItemByWeight(this, kilos);
    }
}
