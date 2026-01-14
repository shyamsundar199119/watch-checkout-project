package eu.handelsbanken.pricing;

public class UnitPriceRule implements PricingRule {

    private int unitPrice;

    public UnitPriceRule(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public int calculate(int quantity) {
        return unitPrice * quantity;
    }
}
