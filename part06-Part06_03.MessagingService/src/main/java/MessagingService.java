
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Myami
 */
public class MessagingService {

    private ArrayList<Message> messages;

    public MessagingService() {

        this.messages = new ArrayList<>();
    }

    public void add(Message message) {
        String m = message.getContent();
        if (m.length() < 281) {
            messages.add(message);

        }

        return;
    }

    public ArrayList<Message> getMessages() {
        return this.messages;
    }
}
