package services;

public class EmailService implements MessageService {

    public boolean sendMessage(String mes, String rec) {
        System.out.println("Email Sent to " + rec + " with message " + mes);
        return true;
    }

}
