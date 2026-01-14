package eu.handelsbanken.domain;

import java.util.List;

public class CheckoutResponse {
    private List<CartItem> cartItemList;
    private int totalPrice;


    public CheckoutResponse(List<CartItem> cartItemList, int totalPrice) {
        this.cartItemList = cartItemList;
        this.totalPrice=totalPrice;
    }

    public List<CartItem> getCartItemList() {
        return cartItemList;
    }

    public int getTotalPrice() {
        return totalPrice;
    }
}
