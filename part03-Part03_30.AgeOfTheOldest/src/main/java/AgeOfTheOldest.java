
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = Integer.MIN_VALUE;
        while (true) {
            
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            String[] line = input.split(",");
            int num = Integer.valueOf(line[1]);
            if(num  >= oldest){
                oldest = num;
            }
        }
        System.out.println("Age of the oldest: "+oldest);

    }
}
