package com.restapi.api.services;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class EmailClient {


    static void sendMail(String item, String to) {

        String from = "yourEmail";

        String host = "localhost";//or IP address
        final String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";
        //Get the session object
        Properties props = System.getProperties();
        props.setProperty("mail.smtp.socketFactory.class", SSL_FACTORY);
        props.setProperty("mail.smtp.socketFactory.fallback", "false");
        props.setProperty("mail.smtp.port", "465");
        props.setProperty("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.auth", "true");
        props.put("mail.debug", "true");
        props.setProperty("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.store.protocol", "pop3");
        props.put("mail.transport.protocol", "smtp");
        final String username = "your_credentials";//
        final String password = "your_credentials";
        try {
            Session session = Session.getDefaultInstance(props,
                    new Authenticator() {
                        @Override
                        protected PasswordAuthentication getPasswordAuthentication() {
                            return new PasswordAuthentication(username, password);
                        }
                    });
            Message message = new MimeMessage(session);

            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject("Ping");
            message.setText(item + "new stock for item added");

            Transport.send(message);
            System.out.println("message sent successfully....");

        } catch (
                MessagingException mex) {
            mex.printStackTrace();
        }
    }


}

