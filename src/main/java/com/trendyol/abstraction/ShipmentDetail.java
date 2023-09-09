package com.trendyol.abstraction;

import java.util.List;

public abstract class ShipmentDetail {

    private final String code;

    public abstract List<ShipmentTracking> getShipmentTrackingList();

    public ShipmentDetail(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
