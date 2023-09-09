package com.trendyol;

import com.trendyol.abstraction.MNGShipmentDetail;
import com.trendyol.abstraction.PTTShipmentDetail;
import com.trendyol.encapsulation.Shipment;
import com.trendyol.polymorphism.member.block.Member;
import com.trendyol.polymorphism.order.cancel.*;

import java.util.Arrays;
import java.util.List;

public class Main {

    private static final List<OrderCancelPenaltyProcessor> ORDER_CANCEL_PENALTY_PROCESSORS = Arrays.asList(new OrderCancelFirstWarningProcessor(), new OrderCancelSecondWarningProcessor(), new OrderCancelFirstGreetingProcessor(), new OrderCancelSecondGreetingProcessor());

    public static void main(String[] args) {
        // Encapsulation
        encapsulation();

        // Polymorphism
        var main = new Main();
        main.polymorphism();

        // Abstraction
        var pttShipmentDetail = new PTTShipmentDetail("code1");
        var mngShipmentDetail = new MNGShipmentDetail("code2");
        var pttShipmentTrackingList = pttShipmentDetail.getShipmentTrackingList();

        System.out.println();
    }

    private static void encapsulation() {
        var shipment = new Shipment();

        shipment.chooseCompany("PTT");
        shipment.shipped("KP123456");
        shipment.cancelShipped();
    }

    private void polymorphism() {
        member();
        orderCancel();
    }

    private static void member() {
        var member = new Member();
        member.suspend("john doe");
        member.suspend("john doe", 5L);
    }

    private void orderCancel() {
        var orderCancelContext = OrderCancelContext.create(1L, 10L, 4L, 0.3); // First Warning

        ORDER_CANCEL_PENALTY_PROCESSORS.forEach(orderCancelPenaltyProcessor -> orderCancelPenaltyProcessor.process(orderCancelContext));
    }
}