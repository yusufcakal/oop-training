package com.trendyol.abstraction;

import java.util.Collections;
import java.util.List;

public class ArasShipmentDetail extends ShipmentDetail {

    public ArasShipmentDetail(String code) {
        super(code);
    }

    @Override
    public List<ShipmentTracking> getShipmentTrackingList() {
        // Rest Call to Aras
        return Collections.emptyList();
    }
}
