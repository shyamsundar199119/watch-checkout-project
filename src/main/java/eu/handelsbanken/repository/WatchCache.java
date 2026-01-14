package eu.handelsbanken.repository;

import eu.handelsbanken.domain.Watch;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class WatchCache {
    private final Map<String, Watch> cache = Map.of(
            "001", new Watch("001", "Rolex" ,100),
            "002", new Watch("002", "Michael Kors" , 80),
            "003", new Watch("003", "Swatch",50),
            "004", new Watch("004", "Casio",30)
    );

    public Watch get(String id) {
        return cache.get(id);
    }
}
