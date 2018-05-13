package com.programowanie2.ksiegarnia.book;

public class HardCoverOrderReprint extends OrderReprint {
    @Override
    public void notifyBookStore() {
        System.out.println("Hard Cover - Notifing Bookstore");
    }

    @Override
    public void notifyPrintingHouse() {
        System.out.println("Hard Cover - Notifing Printing House");
    }
}
