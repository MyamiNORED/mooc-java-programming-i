
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String longest = "" ;
        int sum = 0 ;
        int total = 0 ;
        
        while (true) {
            
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            String[] line = input.split(",");
            int num = Integer.valueOf(line[1]);
            sum += num ;
            total += 1 ;
            if(line[0].length()> longest.length()){
                longest = line[0];
            }
        }
        System.out.println("Longest name: "+ longest);
        System.out.println("Average of the birth years: " + (sum *1.0)/total);

    


    }
}
