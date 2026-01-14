package eu.handelsbanken.repository;

import eu.handelsbanken.domain.Product;
import eu.handelsbanken.exception.NotFoundException;
import eu.handelsbanken.pricing.BundleDiscountRule;
import eu.handelsbanken.pricing.UnitPriceRule;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class ProductRepository {
    private final Map<String, Product> cache = Map.of(
            "001", new Product("001", "Rolex" , new BundleDiscountRule(3,200,100)),
            "002", new Product("002", "Michael Kors" , new BundleDiscountRule(2,120,80)),
            "003", new Product("003", "Swatch", new BundleDiscountRule(2,75,50)),
            "004", new Product("004", "Casio", new UnitPriceRule(30))
    );

    public Product get(String id) {
        if (!cache.containsKey(id)) {
            throw new NotFoundException("Invalid watch id: " + id);
        }
        return cache.get(id);
    }
}
