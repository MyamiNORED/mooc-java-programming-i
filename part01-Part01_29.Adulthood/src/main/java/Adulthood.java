
import java.util.Scanner;

public class Adulthood {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here 
        System.out.println("Give a number:");
        int number = Integer.valueOf(scan.nextLine());
        if(number >= 18 ){
            System.out.println("You are an adult");
        } else {
            System.out.println("You are not an adult");
        } 
        
    }
}
