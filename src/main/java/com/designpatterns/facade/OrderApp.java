package com.designpatterns.facade;

class OrderApp {


    public static void main(String[] args) {
        Order order = new Order("1234");
        OrderFacade facade = new OrderFacade();

        facade.processOrder(order);

        /* <--  poniżej to samo bez wykorzystania class OrderFacade -->
        SaveOrderService saveOrderService = new SaveOrderService();
        saveOrderService.saveOrder(order);

        SendSMSToDriverService sendSMSToDriverService = new SendSMSToDriverService();
        sendSMSToDriverService.sendSMSToDriver();

        SendEmailToUserService sendEmailToUserService = new SendEmailToUserService();
        sendEmailToUserService.sendEmailToUser();

        GenerateBillService generateBillService = new GenerateBillService();
        generateBillService.generateBill();
        */
    }
}
