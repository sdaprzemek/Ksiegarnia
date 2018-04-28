package com.designpatterns.factory;

public class SmsInvitationSender implements InvitationSender{

    public void sendInvitation(Invitation invitation) {
        System.out.println("Invitation Sended via SMS to: " + invitation.getName() + " " + invitation.getSurname());
    }
}
