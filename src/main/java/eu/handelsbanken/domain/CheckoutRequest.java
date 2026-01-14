package eu.handelsbanken.domain;

import java.util.List;

public class CheckoutRequest {
    private List<WatchDto> watchDtoList;

    public CheckoutRequest(List<WatchDto> watchDtoList) {
        this.watchDtoList = watchDtoList;
    }

    public List<WatchDto> getWatchDtoList() {
        return watchDtoList;
    }
}
