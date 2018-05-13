package com.programowanie2.ksiegarnia.book;

public class SoftCoverOrderReprint extends OrderReprint {
    @Override
    public void notifyBookStore() {
        System.out.println("SoftCover - Notyfing Bookstore");
    }

    @Override
    public void notifyPrintingHouse() {
        System.out.println("SOftCover - Notyfing Printing House");
    }
}
