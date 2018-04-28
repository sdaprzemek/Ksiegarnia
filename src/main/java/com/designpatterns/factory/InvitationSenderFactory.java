package com.designpatterns.factory;

public class InvitationSenderFactory {

    public InvitationSender createInvitsationSender(InvitationSenderType type) {
        if (type.equals(InvitationSenderType.EMAIL)) {
            return new EmailInvitationSender();
        } else if (type.equals((InvitationSenderType.SMS))) {
            return new SmsInvitationSender();
        } else {
            return new FaxInvitationSender();
        }
    }

}
