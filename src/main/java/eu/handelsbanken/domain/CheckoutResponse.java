package eu.handelsbanken.domain;

import java.util.List;

public class CheckoutResponse {
    List<WatchDto> watchDtoList;

    public CheckoutResponse(List<WatchDto> watchDtoList) {
        this.watchDtoList = watchDtoList;
    }

    public List<WatchDto> getWatchDtoList() {
        return watchDtoList;
    }
}
