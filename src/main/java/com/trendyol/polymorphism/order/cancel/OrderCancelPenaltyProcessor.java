package com.trendyol.polymorphism.order.cancel;

public interface OrderCancelPenaltyProcessor {

    double ORDER_CANCEL_RATIO_WARNING_STAGE_BEGIN = 0.1;
    double ORDER_CANCEL_RATIO_WARNING_STAGE_END = 0.5;
    double ORDER_CANCEL_RATIO_GREETING_STAGE_BEGIN = 0.3;
    double ORDER_CANCEL_RATIO_GREETING_STAGE_END = 0.5;

    void process(OrderCancelContext orderCancelContext);
}
