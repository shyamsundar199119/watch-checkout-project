package eu.handelsbanken.controller;

import eu.handelsbanken.domain.CheckoutResponse;
import eu.handelsbanken.domain.ProductDto;
import eu.handelsbanken.service.CheckoutService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CheckoutController {

    private CheckoutService checkoutService;

    public CheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    @PostMapping("/checkout")
    public CheckoutResponse checkout(@RequestBody List<ProductDto> productDtoList){
        return checkoutService.calculateCheckoutPrice(productDtoList);
    }
}
