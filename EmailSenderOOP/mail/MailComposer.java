package com.michelon.mail;

import com.mitchellbosecke.pebble.PebbleEngine;
import com.mitchellbosecke.pebble.loader.ClasspathLoader;
import com.mitchellbosecke.pebble.loader.Loader;
import jakarta.mail.internet.AddressException;
import jakarta.mail.internet.InternetAddress;

import java.io.*;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;

public class MailComposerCopy {
    //PebbleEngine search about it
    private static final PebbleEngine pebble;

    //static block - load template
    static {
        var pbBuilder = new PebbleEngine.Builder();
        Loader cpLoader = new ClasspathLoader();
        cpLoader.setSuffix(".html");
        cpLoader.setPrefix("templates/emails/");
        pbBuilder.cacheActive(false).defaultLocale(Locale.ENGLISH).loader(cpLoader);
        //initialization of the attribute pebble
        pebble = pbBuilder.build();
    }

    //Static Nested Class: Composer - parent class - abstract class
    public static abstract class Composer {
        private Email email;

        //constructor
        public Composer() {
            this.email = new Email();
        }

        //5 public methods + 1 abstract method + 2 private methods

        //method to set sender information
        public Composer send(String senderAddress, String senderName) {
            //parse String to InternetAddress and sign it to senderAddress Email property
            this.email.senderAddress = parseEmailAndName(senderAddress, senderName);
            return this;
        }

        //method to set recipient information
        public Composer recipient(String recipientAddress) {
            //parse String to InternetAddress and sign it to recipientAddress Email property
            this.email.recipientAddress = parseOneAddress(recipientAddress);
            return this;
        }

        //method to set body information
        public Composer body(String body) {
            this.email.body = body;
            return this;
        }

        //method to set subject information
        public Composer subject(String subject) {
            this.email.subjectLine = subject;
            return this;
        }

        //method to set subject attachments information
        public Composer attachments(InputStream attachment) {
            this.email.attachments.add(attachment);
            return this;
        }

        //abstract method to build an email
        public abstract Email build();

        private static InternetAddress parseOneAddress(String address) {
            try {
                var sa = InternetAddress.parse(address, false);
                return sa[0];
            } catch (AddressException e) {
                throw new IllegalArgumentException(e);
            }
        }

        private static InternetAddress parseEmailAndName(String emailAddress, String name) {
            try {
                return new InternetAddress(emailAddress, name);
            } catch (UnsupportedEncodingException e) {
                throw new IllegalArgumentException(e);
            }
        }
    }

    //Static Nested Class: StringComposer - child class
    public static class StringComposer extends Composer {

        //constructor
        private StringComposer() {
            super(); //constructor of the parent class Composer
            this.email.mimeType = "text/plain";
        }

        @Override
        public Email build() {
            return this.email;
        }
    }

    //Static Nested Class: TemplateComposer - child class
    public static class TemplateComposer extends Composer {

        private String template;
        private Map<String, Object> context = Collections.emptyMap(); //map Collections of keys: Values
        private Locale locale = Locale.ENGLISH;

        //constructor 1
        private TemplateComposer() {
            super();
            this.email.mimeType = "text/html";
        }

        //METHODS
        //SET LOCALE
        public TemplateComposer locale(Locale locale) {
            if (locale != null) {
                this.locale = locale;
            }
            return this;
        }
        //SET TEMPLATE
        public TemplateComposer template(String templateName) {
            this.template = templateName;
            return this;
        }
        //SET CONTEXT - MESSAGE CONTEXT - SUBJECT CONTEXT
        public TemplateComposer context(Map<String, Object> context) {
            this.context = context;
            return this;
        }

        //BUILD EMAIL METHOD
        public Email build() {
            try {
                Writer w = new StringWriter();
                pebble.getTemplate(this.template).evaluate(w, this.context, this.locale);
                this.email.body = w.toString();
                this.email.mimeType = "text/html";
                this.email.templateName = this.template;
                return this.email;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }

    //METHODS TO INSTANTIATE STRING COMPOSER AND TEMPLATE COMPOSER
    public static StringComposer newStringComposer() {
        return new StringComposer();
    }

    public static TemplateComposer newTemplateComposer() {
        return new TemplateComposer();
    }
}
