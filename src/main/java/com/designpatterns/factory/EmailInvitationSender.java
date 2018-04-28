package com.designpatterns.factory;

public class EmailInvitationSender implements InvitationSender {

    public void sendInvitation(Invitation invitation) {
        System.out.println("Invitation Sended via EMAIL to: " + invitation.getName() + " " + invitation.getSurname());
    }
}

