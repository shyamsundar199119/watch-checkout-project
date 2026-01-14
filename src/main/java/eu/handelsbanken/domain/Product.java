package eu.handelsbanken.domain;

import eu.handelsbanken.pricing.PricingRule;

public class Product {

    private String productId;
    private String productName;
    private PricingRule pricingRule;

    public Product(String productId, String productName, PricingRule pricingRule) {
        this.productId = productId;
        this.productName = productName;
        this.pricingRule = pricingRule;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public PricingRule getPricingRule() {
        return pricingRule;
    }
}
