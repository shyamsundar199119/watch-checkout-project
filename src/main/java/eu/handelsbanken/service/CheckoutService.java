package eu.handelsbanken.service;

import eu.handelsbanken.domain.CartItem;
import eu.handelsbanken.domain.CheckoutResponse;
import eu.handelsbanken.domain.Product;
import eu.handelsbanken.domain.ProductDto;
import eu.handelsbanken.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CheckoutService {

    private ProductRepository productRepository;

    public CheckoutService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public CheckoutResponse calculateCheckoutPrice(List<ProductDto> productDtoList) {
        List<CartItem> cartItemslist = productDtoList.stream().map(productDto -> calulateItemSubtotal(productDto)).collect(Collectors.toList());
        int total = cartItemslist.stream()
                .mapToInt(CartItem::getItemSubtotal)
                .sum();

        return new CheckoutResponse(cartItemslist, total);
    }

    private CartItem calulateItemSubtotal(ProductDto productDto) {
        int itemSubtotal = 0;
        Product product = productRepository.get(productDto.getProductId());
        itemSubtotal = product.getPricingRule()
                .calculate(productDto.getCount());
        return new CartItem(itemSubtotal, product.getProductName(), productDto.getCount(), product);
    }

}
