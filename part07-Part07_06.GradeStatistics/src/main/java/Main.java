
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Stats stats = new Stats();

        // Write your program here -- consider breaking the program into 
        // multiple classes.
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            String input = scanner.nextLine();
            int num = Integer.valueOf(input);
            if (num == -1) {

                System.out.println("Point average (all): " + stats.averageAll());
                if (stats.averagePassing() == 0) {
                    System.out.println("Point average (passing): -");
                } else {
                    System.out.println("Point average (passing): " + stats.averagePassing());

                }
                System.out.println("Pass percentage: "+stats.passPercentage());
                System.out.println("Grade distribution:");
                stats.gradeDistribution();
                break;
            }
            
            if (num >= 0 && num <= 100) {
                stats.addPoints(num);

            }

        }

    }
}
