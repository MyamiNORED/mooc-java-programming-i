
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> books = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("Title: ");
            String title = s.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.println("Pages: ");
            int pages = Integer.valueOf(s.nextLine());
            System.out.println("Publication year: ");
            int year = Integer.valueOf(s.nextLine());
            books.add(new Book(title, pages, year));

        }

        System.out.println("What information will be printed? ");
        String choice = s.nextLine();
        if (choice.compareToIgnoreCase("everything") == 0) {
            for (Book a : books) {
                System.out.println(a.getTitle() + ", " + a.getPages() + " pages, " + a.publication());
            }
        } else if (choice.compareToIgnoreCase("name") == 0) {
            for (Book a : books) {
                System.out.println(a.getTitle());
            }
        }

    }
}
