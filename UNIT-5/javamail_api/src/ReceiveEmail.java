import javax.mail.*;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.util.*;

public class ReceiveEmail {

    public static void main(String[] args) {
        String host = "imap.gmail.com";  // Gmail IMAP server
        String username = "sagardada.info@gmail.com";  // Your Gmail address
        String password = "pzit wcae kpbw jyaw";  // App-specific password (if 2FA is enabled)
        Properties properties = new Properties();
        properties.put("mail.imap.host", host);
        properties.put("mail.imap.port", "993");
        properties.put("mail.imap.ssl.enable", "true");
        try {
            // Set up the session
            Session emailSession = Session.getDefaultInstance(properties);
            // Connect to the mailbox
            Store store = emailSession.getStore("imap");
            store.connect(host, username, password);
            // Open the inbox folder
            Folder folder = store.getFolder("INBOX");
            folder.open(Folder.READ_ONLY);
            // Fetch the messages
            Message[] messages = folder.getMessages();
            // Print the subject, sender, message body and other details of each email
            System.out.println("Total messages: " + messages.length);
            for (int i = 0; i < messages.length; i++) {
                MimeMessage message = (MimeMessage) messages[i];
                System.out.println("Email #" + (i + 1));
                System.out.println("Subject: " + message.getSubject());
                System.out.println("From: " + message.getFrom()[0]);
                System.out.println("Date: " + message.getSentDate());
                System.out.println("----------------------------------------");

                // Print the email body (content)
                Object content = message.getContent();
                if (content instanceof String) {
                    System.out.println("Body: " + content);
                } else if (content instanceof MimeMultipart) {
                    MimeMultipart multipart = (MimeMultipart) content;
                    for (int j = 0; j < multipart.getCount(); j++) {
                        MimeBodyPart part = (MimeBodyPart) multipart.getBodyPart(j);
                        if (part.isMimeType("text/plain")) {
                            System.out.println("Body: " + part.getContent());
                        }
                    }
                }

                System.out.println("----------------------------------------");
            }



            // Close the folder and store
            folder.close(false); //If true were passed instead, any messages flagged for deletion would be permanently removed.
            store.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

