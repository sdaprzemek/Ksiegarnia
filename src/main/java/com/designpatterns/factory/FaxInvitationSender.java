package com.designpatterns.factory;

public class FaxInvitationSender implements InvitationSender {

    public void sendInvitation(Invitation invitation) {
        System.out.println("Invitation Sended via FAX to: " + invitation.getName() + " " + invitation.getSurname());
    }
}

