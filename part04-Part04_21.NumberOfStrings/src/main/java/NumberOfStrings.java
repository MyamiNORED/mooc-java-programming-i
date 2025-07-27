
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0 ;
        while(true){
            String input = scanner.nextLine();
            if(input.compareTo("end") == 0){
                break;
            }
            sum += 1;
            
        }
        System.out.println(sum);
    }
}
