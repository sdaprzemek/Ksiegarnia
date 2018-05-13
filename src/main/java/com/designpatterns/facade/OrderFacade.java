package com.designpatterns.facade;

class OrderFacade {

    private SaveOrderService saveOrderService;

    private SendEmailToUserService sendEmailToUserService;

    private SendSMSToDriverService sendSMSToDriverService;

    private GenerateBillService generateBillService;

    public OrderFacade() {
        saveOrderService = new SaveOrderService();
        sendEmailToUserService = new SendEmailToUserService();
        sendSMSToDriverService = new SendSMSToDriverService();
        generateBillService = new GenerateBillService();
    }

    public void processOrder(Order order) {
        saveOrderService.saveOrder(order);
        sendSMSToDriverService.sendSMSToDriver();
        sendEmailToUserService.sendEmailToUser();
        generateBillService.generateBill();
    }
}
