
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");
        int number = Integer.valueOf(scanner.nextLine());
        int fact = 1;
        int count = 1;
        while(count <= number ){
            fact *= count;
            count++;
        }
        System.out.println("Factorial: " + fact);

    }
}
