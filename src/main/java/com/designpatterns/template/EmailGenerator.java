package com.designpatterns.template;

import java.util.Collections;
import java.util.List;

abstract class EmailGenerator {

    List<String> to;

    List<String> cc;

    String topic;

    protected abstract void setToList();

    public abstract void setTopic();

    public final void sendEmail() {
        setToList();
        setCcList();
        setToList();
        printEmail();

    }

    void setCcList() {
        cc = Collections.emptyList();

    }

    private void printEmail() {
        System.out.println("Email topic: " + topic);
        System.out.println("Email to: ");

        to.forEach(System.out::print);
        System.out.println("");
        System.out.println("Email cc: "); //TODO < -- nie wyswietla wszystkiego przez te metode

    }



}
