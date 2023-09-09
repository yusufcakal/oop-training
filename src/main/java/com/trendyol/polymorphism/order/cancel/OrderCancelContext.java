package com.trendyol.polymorphism.order.cancel;

public class OrderCancelContext {

    private Long sellerId;
    private Long totalOrderCount;
    private Long totalOrderCancelCount;
    private double previousCancelRatio;

    public static OrderCancelContext create(Long sellerId, Long totalOrderCount, Long totalOrderCancelCount, double previousCancelRatio) {
        var orderCancelContext = new OrderCancelContext();
        orderCancelContext.setSellerId(sellerId);
        orderCancelContext.setTotalOrderCount(totalOrderCount);
        orderCancelContext.setTotalOrderCancelCount(totalOrderCancelCount);
        orderCancelContext.setPreviousCancelRatio(previousCancelRatio);

        return orderCancelContext;
    }

    public boolean isCurrentCancelRatioLowerThanPreviousOne() {
        return getCurrentCancelRatio() < getPreviousCancelRatio();
    }

    public boolean isCurrentCancelRatioHigherThanPreviousOne() {
        return getCurrentCancelRatio() > getPreviousCancelRatio();
    }

    public double getCurrentCancelRatio() {
        return (double) totalOrderCancelCount / totalOrderCount;
    }

    public Long getSellerId() {
        return sellerId;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    public Long getTotalOrderCount() {
        return totalOrderCount;
    }

    public void setTotalOrderCount(Long totalOrderCount) {
        this.totalOrderCount = totalOrderCount;
    }

    public Long getTotalOrderCancelCount() {
        return totalOrderCancelCount;
    }

    public void setTotalOrderCancelCount(Long totalOrderCancelCount) {
        this.totalOrderCancelCount = totalOrderCancelCount;
    }

    public double getPreviousCancelRatio() {
        return previousCancelRatio;
    }

    public void setPreviousCancelRatio(double previousCancelRatio) {
        this.previousCancelRatio = previousCancelRatio;
    }
}
