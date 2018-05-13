package com.programowanie2.ksiegarnia.book;

public abstract class OrderReprint {

    public void OrderReprint() {
        beginOrderReprint();
        notifyPrintingHouse();
        endOrderReprinting();
        notifyBookStore();
    }

    protected abstract void notifyBookStore();

    private void beginOrderReprint() {
        System.out.println("Beggining reprinting");
    }

    protected abstract void notifyPrintingHouse();

    private void endOrderReprinting() {
        System.out.println("Ending reprinting");
    }
}
