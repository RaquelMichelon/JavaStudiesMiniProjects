package com.michelon.mail;

import jakarta.mail.internet.InternetAddress;

import java.io.InputStream;
import java.util.List;
import java.util.Objects;

public class Email {

    public InternetAddress senderAdress;
    public InternetAddress recipientAdress;
    public String templateName;
    public String subjectLine;
    public String mimeType;
    public String body;
    public List<InputStream> attachments;

    @Override
    public String toString() {
        return "EmailCopy{" +
                "senderAdress=" + senderAdress +
                ", recipientAdress=" + recipientAdress +
                ", templateName='" + templateName + '\'' +
                ", subjectLine='" + subjectLine + '\'' +
                ", mimeType='" + mimeType + '\'' +
                ", body='" + body + '\'' +
                ", attachments=" + attachments +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmailCopy emailCopy = (EmailCopy) o;
        return Objects.equals(senderAdress, emailCopy.senderAdress) && Objects.equals(recipientAdress, emailCopy.recipientAdress) && Objects.equals(templateName, emailCopy.templateName) && Objects.equals(subjectLine, emailCopy.subjectLine) && Objects.equals(mimeType, emailCopy.mimeType) && Objects.equals(body, emailCopy.body) && Objects.equals(attachments, emailCopy.attachments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(senderAdress, recipientAdress, templateName, subjectLine, mimeType, body, attachments);
    }
}
