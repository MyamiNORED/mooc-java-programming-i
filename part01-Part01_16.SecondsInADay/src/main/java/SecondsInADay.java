
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program hereSystem.out.println("How many days would you like to convert to seconds?");

        System.out.println("How many days would you like to convert to seconds?");

        int days = Integer.valueOf(scanner.nextLine());

        int secondsInADay = days * 24 * 60 * 60;

        System.out.println(secondsInADay);

    }
}
