package eu.handelsbanken.domain;

public class Watch {

    private String watchId;
    private String watchName;
    private int unitPrice;

    public Watch(String watchId, String watchName, int unitPrice) {
        this.watchId = watchId;
        this.watchName = watchName;
        this.unitPrice = unitPrice;
    }

    public String getWatchId() {
        return watchId;
    }

    public String getWatchName() {
        return watchName;
    }

    public int getUnitPrice() {
        return unitPrice;
    }
}
