package eu.handelsbanken.domain;

import java.util.List;

public class CheckoutRequest {
    private List<ProductDto> productDtoList;

    public CheckoutRequest(List<ProductDto> productDtoList) {
        this.productDtoList = productDtoList;
    }

    public List<ProductDto> getProductDtoList() {
        return productDtoList;
    }
}
