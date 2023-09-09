package com.trendyol.polymorphism.order.cancel;

import java.util.logging.Level;
import java.util.logging.Logger;

public class OrderCancelFirstWarningProcessor implements OrderCancelPenaltyProcessor {

    private static final Logger LOGGER = Logger.getLogger(OrderCancelFirstWarningProcessor.class.getName());

    @Override
    public void process(OrderCancelContext orderCancelContext) {
        if (orderCancelContext.isCurrentCancelRatioHigherThanPreviousOne() && isTotalCancelRatioInTheFirstStage(orderCancelContext)) {
            // send a notification to the seller to be warning
            // make the search weight lower to be seen rarely
            LOGGER.log(Level.INFO, "OrderCancelFirstWarningProcessor");
        }
    }

    private static boolean isTotalCancelRatioInTheFirstStage(OrderCancelContext orderCancelContext) {
        var currentCancelRatio = orderCancelContext.getCurrentCancelRatio();
        return ORDER_CANCEL_RATIO_WARNING_STAGE_BEGIN < currentCancelRatio && currentCancelRatio < ORDER_CANCEL_RATIO_WARNING_STAGE_END;
    }
}
