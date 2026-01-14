package eu.handelsbanken.domain;

import java.util.List;

public class CheckoutResponse {
    private List<WatchDto> watchDtoList;
    private int totalPrice;


    public CheckoutResponse(List<WatchDto> watchDtoList, int totalPrice) {
        this.watchDtoList = watchDtoList;
        this.totalPrice=totalPrice;
    }

    public List<WatchDto> getWatchDtoList() {
        return watchDtoList;
    }

    public int getTotalPrice() {
        return totalPrice;
    }
}
