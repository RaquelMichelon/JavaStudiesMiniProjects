package emails;

import jakarta.mail.*; // provides classes that model a mail system
import jakarta.mail.internet.InternetAddress; //provides classes that are focused to Internet mail systems
import jakarta.mail.internet.MimeMessage;

import java.util.Properties;

/***
 * How to send a simple email message via an SMTP server
 * always use the jakarta reference instead of javax to import packages
 *
 * STEP 1
 * Configure the SMTP server details using the Java Properties object.
 * Here I'm going to use Mailtrap to set up my SMTP server. Mailtrap is a simple tool that provides
 * a fake SMTP server for testing, reviewing, and analyzing email functionalities during development.
 * Just open an account and get your free SMTP server details to continuing. Or, you can also get SMTP
 * server details from any other email service provider.
 */

public class JakartaEmail {

    public static void main(String[] args) {
        String to = "jakartato@example.com"; //provide recipient's email ID
        String from = "jakartafrom@example.com"; //provide sender's email ID
        final String username = "833..."; //provide Mailtrap's username
        final String password = "94f..."; //provide Mailtrap's password
        String host = "smtp.mailtrap.io"; //provide Mailtrap's host address

        //configure Mailtrap's SMTP server details
        Properties props = new Properties();
        //        props.put("mail.debug", "true"); //in case I need to debug
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", "2525");

        /*
         * The Session class, which is not subclassed, is the top-level class of the Jakarta Mail API.
         * It’s a multithreaded object that acts as the connection factory for the Jakarta Mail API—apart
         * from collecting the mail API’s properties and defaults, it is responsible for configuration settings
         * and authentication.
         *
         * The Authenticator class is an abstract class that is used to get authentication to access
         * the mail server resources—often by requiring the user’s information. Usually, its PasswordAuthentication
         * subclass is commonly used.
         *
         * STEP 2
         * Create a Session object by calling the getInstance() method. Then, pass the Mailtrap’s username
         * and password to PasswordAuthentication. When creating the session object, you should always register
         * the Authenticator with the Session.
         */
        //create the Session object
        Session session = Session.getInstance(props,
                new jakarta.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        /*
         * The Message class is an abstract class that models an email message;
         * its subclasses support the actual implementations. Usually, its MimeMessage subclass
         * (javax.mail.internet.MimeMessage) is used for actually crafting the details of the email
         * message to be sent. A MimeMessage is an email message that uses the MIME
         * (Multipurpose Internet Mail Extension) formatting style.
         *
         * setRecipients(Message.RecipientType type, String addresses)—
         * it’s used to set the stated recipient type to the provided addresses.
         * The possible defined address types are “TO” (Message.RecipientType.TO),
         * “CC” (Message.RecipientType.CC), and “BCC” (Message.RecipientType.BCC).
         *
         * The Address class is an abstract class that models the addresses (To and From addresses)
         * in an email message; its subclasses support the actual implementations. Usually,
         * its javax.mail.internet.InternetAddress subclass, which denotes an Internet email address,
         * is commonly used.
         *
         * The Transport class is an abstract class that uses the SMTP protocol for submitting
         * and transporting email messages.
         *
         * STEP 3
         * Once the Session object is created, the next step is to create the email message to be sent.
         * To do this, start by passing the created session object in the MimeMessage class constructor.
         * Next, after creating the message object, set the From, To, and Subject fields for the email message.
         * Use the setText() method to set the content of the email message.
         * In case of Sending HTML email, the only difference is that here, instead of the setText() method,
         * we’ll be using the setContent() method to set content and specify “text/html” in the second argument,
         * indicating the message has HTML content.
         *
         * Use the Transport object to send the email message.
         * Add Exceptions to retrieve the details of any possible errors when sending the message.
         */

        try {
            Message message = new MimeMessage(session); //create a MimeMessage object
            message.setFrom(new InternetAddress(from)); //set From email field
            message.setRecipients(Message.RecipientType.TO, //set To email field
                    InternetAddress.parse(to));
            message.setSubject("Here comes my first Jakarta Mail!"); //set email subject field
            //message.setText("Hello, world! Just discovered that Jakarta Mail is completely easy to use"); //set the content of the email message
            //set the content of the email message
            message.setContent("Yey! This is an HTML content :)", "text/html");
            Transport.send(message); //send the email message
            System.out.println("Uhull! Email Message Sent Successfully :)");
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}
