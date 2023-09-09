package com.trendyol.abstraction;

import java.util.Collections;
import java.util.List;

public class PTTShipmentDetail extends ShipmentDetail {

    public PTTShipmentDetail(String code) {
        super(code);
    }

    @Override
    public List<ShipmentTracking> getShipmentTrackingList() {
        // SOAP Call to PTT
        return Collections.emptyList();
    }
}
