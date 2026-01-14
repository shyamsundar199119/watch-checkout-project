package eu.handelsbanken.domain;

public class CartItem {

    private final int itemSubtotal;
    private final String productName;
    private final int quantity;
    private final Watch product;

    public CartItem(int itemSubtotal, String productName, int quantity, Watch product) {
        this.itemSubtotal = itemSubtotal;
        this.productName = productName;
        this.quantity = quantity;
        this.product = product;
    }

    public int getItemSubtotal() {
        return itemSubtotal;
    }

    public String getProductName() {
        return productName;
    }
}
