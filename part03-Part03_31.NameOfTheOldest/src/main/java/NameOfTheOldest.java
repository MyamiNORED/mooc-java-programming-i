
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = Integer.MIN_VALUE;
        String name = null;
        while (true) {

            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            String[] line = input.split(",");
            int num = Integer.valueOf(line[1]);
            if (num >= oldest) {
                oldest = num;
                name = line[0];
            }
        }
        System.out.println("Name of the oldest: " + name);

    }

}
