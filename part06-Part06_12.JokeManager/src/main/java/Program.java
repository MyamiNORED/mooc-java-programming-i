
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        
        for(int i = 0 ; i < 10 ; i++ ){
            System.out.println(  (int) (Math.random() * 10)%2);
                    }
        
        

        // IndexOutOfBoundsException: Index 2 out of bounds for length 2, in call drawJoke().
        //An error occurred when drawing a joke. Test the code:
        /*JokeManager manager = new JokeManager();
        manager.addJoke("What is red and smells of blue paint? - Red paint.");
        manager.addJoke("MWhat is blue and smells of red paint? - Blue paint.");
        System.out.println(manager.drawJoke());
        */
        /*
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> jokes = new ArrayList<>();
        System.out.println("What a joke!");
        while (true) {
        System.out.println("Commands:");
        System.out.println(" 1 - add a joke");
        System.out.println(" 2 - draw a joke");
        System.out.println(" 3 - list jokes");
        System.out.println(" X - stop");
        String command = scanner.nextLine();
        if (command.equals("X")) {
        break;
        }
        if (command.equals("1")) {
        System.out.println("Write the joke to be added:");
        String joke = scanner.nextLine();
        jokes.add(joke);
        } else if (command.equals("2")) {
        System.out.println("Drawing a joke.");
        if (jokes.isEmpty()) {
        System.out.println("Jokes are in short supply.");
        } else {
        Random draw = new Random();
        int index = rand.nextInt(jokes.size());
        System.out.println(jokes.get(index));
        }
        } else if (command.equals("3")) {
        System.out.println("Printing the jokes.");
        for (String joke : jokes) {
        System.out.println(joke);
        }
        }
        }
         */
    }
}
