import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

public class SendEmail extends Authenticator {
    static String from = "sagardada.info@gmail.com";
    static String pass = "pzit wcae kpbw jyaw";
    static InternetAddress to;

    public static void main(String[] args) {
        try {
            // Get the session object
            Properties properties = System.getProperties();
            properties.put("mail.smtp.auth", "true");
            properties.put("mail.smtp.starttls.enable", "true"); // enables TLS (Transport Layer Security)
            properties.put("mail.smtp.host", "smtp.gmail.com");
            properties.put("mail.smtp.port", "587");

            // Create a session with authentication
            Session session = Session.getDefaultInstance(properties, new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(from, pass);
                }
            });
            // Compose the message
            MimeMessage msg = new MimeMessage(session);
            msg.setFrom(new InternetAddress(from));
            to = new InternetAddress("sagar.stha.brt@gmail.com");
            msg.addRecipient(Message.RecipientType.TO, to);
            msg.setSubject("Test Java Mail");
            msg.setText("Hello, this is a test email of JavaMail API.");
            // Send the message
            Transport transport = session.getTransport("smtp");
            transport.connect("smtp.gmail.com", from, pass);
            transport.sendMessage(msg, msg.getAllRecipients());
            transport.close();

            System.out.println("Message sent successfully.");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
