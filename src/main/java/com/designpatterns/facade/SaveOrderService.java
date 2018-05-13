package com.designpatterns.facade;

class SaveOrderService {


    public void saveOrder(Order order){
        System.out.println("Saved order number " + order.getOrderNumber());
    }
}
