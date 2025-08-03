
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Myami
 */
public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner s, SimpleDictionary t) {
        this.scanner = s;
        this.dictionary = t;
    }

    public void start() {
        while (true) {
            System.out.println("Command: ");
            String input = scanner.nextLine();
            if (input.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (input.equals("add")) {
                System.out.println("Word: ");
                String word = scanner.nextLine();
                System.out.println("Translation: ");
                String translation = scanner.nextLine();
                dictionary.add(word, translation);
            } else if (input.equals("search")) {
                 System.out.println("To be translated:");
                String translateThis = scanner.nextLine();
                if (dictionary.translate(translateThis) == null) {
                    System.out.println("Word " + translateThis +" was not found");
                } else {
                    System.out.println("Translation: " + dictionary.translate(translateThis));
                }

            } else {
                System.out.println("Unknown command");
            }
        }
    }

}
