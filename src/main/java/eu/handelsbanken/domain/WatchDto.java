package eu.handelsbanken.domain;

public class WatchDto {
    private String productId;
    private int count;

    public WatchDto(String productId, int count) {
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
