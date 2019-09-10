package com.epam.log4j;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class ExampleSMS {
    // Find your Account Sid and Auth Token at twilio.com/console
    public static final String ACCOUNT_SID =
            "AC0047405cb1fc1401a8309601b1024389";
    public static final String AUTH_TOKEN =
            "805b7ebe07e56bc35e68884f3a2799f9";

    public static void send(String str) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        Message message = Message
                .creator(new PhoneNumber("+380968845604"), // to
                        new PhoneNumber("+15204628856"), // from
                        str)
                .create();
    }

    public static void main(String[] args) {
        send("Hello");
    }
}
