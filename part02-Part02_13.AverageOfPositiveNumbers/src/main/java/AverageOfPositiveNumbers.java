
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;
        int sum = 0;
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            }
            if (number > 0) {
                sum += number;
                total++;
            }
        }

        if (total == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            double avg = sum / (total * 1.0);
            System.out.println(avg);
        }

    }
}
