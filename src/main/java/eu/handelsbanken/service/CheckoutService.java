package eu.handelsbanken.service;

import eu.handelsbanken.domain.CartItem;
import eu.handelsbanken.domain.CheckoutResponse;
import eu.handelsbanken.domain.Watch;
import eu.handelsbanken.domain.WatchDto;
import eu.handelsbanken.repository.WatchCache;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CheckoutService {

    private WatchCache watchCache;

    public CheckoutService(WatchCache watchCache) {
        this.watchCache = watchCache;
    }

    public CheckoutResponse calculateCheckoutPrice(List<WatchDto> watchDtoList) {
        List<CartItem> cartItemslist = watchDtoList.stream().map(watchDto -> calulateItemSubtotal(watchDto)).collect(Collectors.toList());
        int total = cartItemslist.stream()
                .mapToInt(CartItem::getItemSubtotal)
                .sum();

        return new CheckoutResponse(cartItemslist, total);
    }

    private CartItem calulateItemSubtotal(WatchDto watchDto) {
        int itemSubtotal = 0;
        Watch product = watchCache.get(watchDto.getProductId());
        itemSubtotal = itemSubtotal + (product.getUnitPrice() * watchDto.getCount());
        return new CartItem(itemSubtotal, product.getWatchName(), watchDto.getCount(), product);
    }

}
