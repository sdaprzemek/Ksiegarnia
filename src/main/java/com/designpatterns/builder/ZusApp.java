package com.designpatterns.builder;

import com.designpatterns.builder.ZusForm.ZusFormBuilder;

class ZusApp {

    public static void main(String[] args) {
        ZusForm zusForm = ZusFormBuilder.builder()
                .name("Przemek")
                .surname("Miller")
                .city("Lodz").build();
        ZusForm zusForm1 = ZusFormBuilder.builder()
                .street("Bartoka")
                .city("Lodz")
                .build();
        ZusForm zusForm2 = ZusFormBuilder.builder()
                .female(true)
                .age(30)
                .name("Iwona")
                .build();
        System.out.println("DEBUG");
    }

}

