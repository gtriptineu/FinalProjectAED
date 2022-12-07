/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SMTPEmail;

import static constants.EmailConnection.*;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Lenovo
 */
public class Email {
    public static void sendEmail(String toEmail, String subjectLine, String body){
        
        Properties properties = new Properties();
        
        properties.setProperty("mail.smtp.protocol", "smtp");
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
        properties.put("mail.smtp.socketFactory.fallback", "false");
    
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        

        Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(FROM_EMAILID, EMAIL_PASSWORD);
            }
        });
        
        try{
            MimeMessage msg = new MimeMessage(session);
            msg.setFrom(new InternetAddress(FROM_EMAILID));
            msg.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
            msg.setSubject(subjectLine);
            msg.setContent(body, "text/html; charset=UTF-8");  
            Transport.send(msg);
            System.out.println("Done");
        } catch(Exception e){
            System.out.print(e.getMessage());
        }
    
    }
}
