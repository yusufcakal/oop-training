package com.trendyol.encapsulation;

import java.time.Instant;
import java.util.Date;
import java.util.UUID;

public class Shipment {

    private Quota quota;
    private String company;
    private String code;
    private Status status;
    private String trackingNumber;
    private Date shippedDate;

    public void shipped(String trackingNumber) {
        setTrackingNumber(trackingNumber);
        setShippedDate(Date.from(Instant.now()));
        setStatus(Status.SHIPPED);
    }

    public void cancelShipped() {
        setTrackingNumber(null);
        setShippedDate(null);
        setStatus(Status.CANCELLED);
    }

    public void chooseCompany(String company) {
        setCompany(company);
        setStatus(Status.WAITING_FOR_SHIPPED);
        setCode(UUID.randomUUID().toString());
    }

    public String getCompany() {
        return company;
    }

    private void setCompany(String company) {
        this.company = company;
    }

    public String getCode() {
        return code;
    }

    private void setCode(String code) {
        this.code = code;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    private void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public Status getStatus() {
        return status;
    }

    private void setStatus(Status status) {
        this.status = status;
    }

    public Date getShippedDate() {
        return shippedDate;
    }

    private void setShippedDate(Date shippedDate) {
        this.shippedDate = shippedDate;
    }
}
