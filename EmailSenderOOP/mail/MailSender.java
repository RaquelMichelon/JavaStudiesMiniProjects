package com.michelon.mail;

import com.michelon.AppConfig;
import jakarta.activation.DataHandler;
import jakarta.mail.*;
import jakarta.mail.internet.MimeMessage;
import jakarta.mail.util.ByteArrayDataSource;

import java.io.IOException;
import java.util.Date;

public class MailSenderCopy {

    private final AppConfig mailConfig;

    //constructor
    public MailSender(AppConfig mailConfig) {
        this.mailConfig = mailConfig;
    }

    //method to send email
    public void sendEmail(Email email) {
        //set SMTP USERNAME
        var username = this.mailConfig.getProperty("email", "mail.smtp.username");
        //SET SMTP PASSWORD
        var password = this.mailConfig.getProperty("email", "mail.smtp.password");
        //SET SESSION PROPERTIES
        var sessionProperties = this.mailConfig.getGroup("email");
        //SET NUMBER MAX OF ATTEMPTS
        int remainingAttempts = 3;

        boolean sent = false;
        while (!sent && remainingAttempts > 0) {
            try {
                //GET INSTANCE OF A SESSION JAKARTA MAIL
                Session mailSession = Session.getInstance(sessionProperties);
                //NEW MimeMessage
                var message = new MimeMessage(mailSession);
                //SET EMAIL SENDER
                message.addFrom(new Address[]{email.senderAddress});
                //SET EMAIL RECIPIENTS
                message.setRecipients(Message.RecipientType.TO, new Address[]{email.recipientAddress});
                //SET EMAIL SUBJECT
                message.setSubject(email.subjectLine);
                //SET DATE
                message.setSentDate(new Date());

                //MAIL SOURCE // BODY MIMETYPE
                var mailSource = new ByteArrayDataSource(email.body, email.mimeType);
                message.setDataHandler(new DataHandler(mailSource));

                //SEND EMAIL
                Transport.send(message, username, password);
                sent = true;

            } catch (MessagingException | IOException me) {
                me.printStackTrace();
                System.err.println("Failed to send email to " + email.recipientAddress.getAddress());
                remainingAttempts -= 1;
                System.err.println("Remaining attempts " + remainingAttempts);
            }
        }
        if (sent) {
            System.err.println("Email sent successfully: " + email);
        } else {
            System.err.println("Failed to send email after 3 attempts: " + email);
        }
    }
}
