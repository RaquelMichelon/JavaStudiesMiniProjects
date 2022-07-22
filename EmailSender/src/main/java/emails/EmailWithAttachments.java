package emails;

import jakarta.activation.DataHandler;
import jakarta.activation.DataSource;
import jakarta.activation.FileDataSource;
import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeBodyPart;
import jakarta.mail.internet.MimeMessage;
import jakarta.mail.internet.MimeMultipart;

import java.util.Properties;

/***
 * Send an Email with Attachments in Jakarta Mail
 * All explanations can be read on JakartaEmail class :)
 *
 * DIFFER STEPS
 * Create an instance of the MimeMultipart object that will be used for wrapping
 * the MimeBodyPart body parts. A Multipart acts like a container that keeps multiple
 * body parts, and it comes with methods for getting and setting its various subparts.
 *
 * Then, set the first part of the multipart object by passing the actual message to it.
 * Next, set the second part of the multipart object by adding the attachment using a
 * DataHandler object.
 * Include the multipart in the message to be sent.
 */

public class EmailWithAttachments {

    public static void main(String[] args) {
        String to = "jakartato@example.com";
        String from = "jakartafrom@example.com";
        final String username = "833...";
        final String password = "94f...";
        String host = "smtp.mailtrap.io";

        //configure SMTP server details
        Properties props = new Properties();
//        props.put("mail.debug", "true"); //in case I need to debug
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", "2525");

        //create the Session object
        Session session = Session.getInstance(props,
                new jakarta.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(to));
            message.setSubject("Here comes my ATTACHMENT with jakarta email!");

            BodyPart messageBodyPart = new MimeBodyPart(); //create the message body part

            //set the actual message
            messageBodyPart.setText("Hello, world! Just discovered that Jakarta Mail is completely easy to use. Please find the attachment sent using Jakarta Mail");

            Multipart multipart = new MimeMultipart(); //create an instance of multipart object

            multipart.addBodyPart(messageBodyPart); //set the first text message part

            //set the second part, which is the attachment
            messageBodyPart = new MimeBodyPart();
            String filename = "/Users/raqueldarellimichelon/IdeaProjects/EmailSender/meuAttachment.txt";
            DataSource source = new FileDataSource(filename);
            messageBodyPart.setDataHandler(new DataHandler(source));
            messageBodyPart.setFileName(filename);
            multipart.addBodyPart(messageBodyPart);

            message.setContent(multipart); //send the entire message parts

            Transport.send(message); //send the email message

            System.out.println("Uhull! Email Message Sent Successfully :)");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }

    }
}

