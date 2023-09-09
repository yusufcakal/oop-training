package com.trendyol.abstraction;

import java.util.Collections;
import java.util.List;

public class MNGShipmentDetail extends ShipmentDetail {

    public MNGShipmentDetail(String code) {
        super(code);
    }

    @Override
    public List<ShipmentTracking> getShipmentTrackingList() {
        // SOAP Call to Aras
        return Collections.emptyList();
    }
}
