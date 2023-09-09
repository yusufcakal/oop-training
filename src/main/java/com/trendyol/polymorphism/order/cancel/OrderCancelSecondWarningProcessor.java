package com.trendyol.polymorphism.order.cancel;

public class OrderCancelSecondWarningProcessor implements OrderCancelPenaltyProcessor {

    @Override
    public void process(OrderCancelContext orderCancelContext) {
        if (orderCancelContext.isCurrentCancelRatioHigherThanPreviousOne() && isTotalCancelRatioInTheSecondStage(orderCancelContext)) {
            // send a notification to the seller to be warning
            // make the search weight lower to be seen rarely
        }
    }

    private static boolean isTotalCancelRatioInTheSecondStage(OrderCancelContext orderCancelContext) {
        var currentCancelRatio = orderCancelContext.getCurrentCancelRatio();
        return ORDER_CANCEL_RATIO_WARNING_STAGE_END < currentCancelRatio;
    }
}
