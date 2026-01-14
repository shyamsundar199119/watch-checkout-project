package eu.handelsbanken.service;

import eu.handelsbanken.domain.CheckoutResponse;
import eu.handelsbanken.domain.WatchDto;
import eu.handelsbanken.repository.WatchCache;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class CheckoutServiceTest {

    private CheckoutService checkoutService = new CheckoutService(new WatchCache());

    @Test
    public void shouldApplyDiscountPriceForOneProduct() {
        CheckoutResponse checkoutResponse = checkoutService.calculateCheckoutPrice(List.of(new WatchDto("001", 3)));
        assertEquals(200, checkoutResponse.getTotalPrice());
    }

    @Test
    public void shouldCalculateUnitPriceWhenNoDiscountRuleExists(){
        CheckoutResponse checkoutResponse = checkoutService.calculateCheckoutPrice(List.of(new WatchDto("001", 1)));
        assertEquals(100, checkoutResponse.getTotalPrice());
    }

    @Test
    public void shouldAddDiscountedAndUnitPrice(){
        CheckoutResponse checkoutResponse = checkoutService.calculateCheckoutPrice(List.of(new WatchDto("001", 3), new WatchDto("003", 1)));
        assertEquals(250, checkoutResponse.getTotalPrice());
    }

    @Test
    public void shouldApplyDiscountForTwoProduct(){
        CheckoutResponse checkoutResponse = checkoutService.calculateCheckoutPrice(List.of(new WatchDto("001", 3), new WatchDto("002", 2)));
        assertEquals(320, checkoutResponse.getTotalPrice());
    }

    @Test
    public void shouldApplyDiscountMutlipleTimes(){
        CheckoutResponse checkoutResponse = checkoutService.calculateCheckoutPrice(List.of(new WatchDto("001", 6)));
        assertEquals(400, checkoutResponse.getTotalPrice());
    }
}
