package com.designpatterns.factory;

import java.util.Scanner;

class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How would you like to send invitation ?");
        System.out.println("1. SMS");
        System.out.println("2. EMAIL");
        System.out.println("3. FAX");
        InvitationSenderFactory factory = new InvitationSenderFactory();

        int i = scanner.nextInt();
        InvitationSender invitationSender;
        if (i == 1) {
            invitationSender = factory.createInvitsationSender(InvitationSenderType.SMS);
        } else if (i == 2) {
            invitationSender = factory.createInvitsationSender(InvitationSenderType.EMAIL);
        } else if (i == 3) {
            invitationSender = factory.createInvitsationSender(InvitationSenderType.FAX);
        } else {
            System.out.println("BAD ARGUMENT");
            return;
        }

        Invitation invitation = new Invitation("Adam", "Marciniak", "Poland");
        invitationSender.sendInvitation(invitation);

    }
}
