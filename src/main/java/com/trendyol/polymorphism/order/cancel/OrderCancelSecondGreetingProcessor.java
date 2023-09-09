package com.trendyol.polymorphism.order.cancel;

public class OrderCancelSecondGreetingProcessor implements OrderCancelPenaltyProcessor {

    @Override
    public void process(OrderCancelContext orderCancelContext) {
        if (orderCancelContext.isCurrentCancelRatioLowerThanPreviousOne() && isTotalCancelRatioInTheSecondStage(orderCancelContext)) {
            // send a notification to the seller to be greeting
            // make the search weight higher to be seen more
        }
    }

    private static boolean isTotalCancelRatioInTheSecondStage(OrderCancelContext orderCancelContext) {
        var currentCancelRatio = orderCancelContext.getCurrentCancelRatio();
        return currentCancelRatio < ORDER_CANCEL_RATIO_GREETING_STAGE_BEGIN;
    }
}
