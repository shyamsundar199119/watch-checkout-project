package eu.handelsbanken.domain;

public class ProductDto {
    private String productId;
    private int count;

    public ProductDto(String productId, int count) {
        this.productId = productId;
        this.count = count;
    }

    public String getProductId() {
        return productId;
    }

    public int getCount() {
        return count;
    }
}
