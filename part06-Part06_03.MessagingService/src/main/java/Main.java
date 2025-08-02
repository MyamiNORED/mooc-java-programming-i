
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Try out your class here
        String mc = "abcdefghijklmnopqrstuvxyz";
        mc = mc + mc + mc + mc + mc + mc + mc +mc+mc +mc+mc+"rrrrr";
        System.out.println(mc.length());

        Message m = new Message("sender", mc);
        ArrayList<Message> messages = null;
        MessagingService t  = new MessagingService();
        
        t.add(m);
        System.out.println(t.getMessages().toString());

    }
}
