package eu.handelsbanken.pricing;

public class BundleDiscountRule implements PricingRule {
    private int unitPrice;
    private int bundlePrice;
    private int bundleQuantity;

    public BundleDiscountRule(int bundleQuantity, int bundlePrice, int unitPrice) {
        this.unitPrice = unitPrice;
        this.bundlePrice = bundlePrice;
        this.bundleQuantity = bundleQuantity;
    }

    @Override
    public int calculate(int quantity) {
        int bundleCount = quantity / bundleQuantity;
        int remainingCount = quantity % bundleQuantity;
        return bundleCount * bundlePrice + remainingCount * unitPrice;
    }
}
