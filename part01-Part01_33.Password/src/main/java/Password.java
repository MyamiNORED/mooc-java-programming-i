
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here 
        System.out.println("Password?");
        String pass = scan.nextLine();
        if(pass.compareTo("Caput Draconis") == 0){
            System.out.println("Welcome!");
        }else{
            System.out.println("Off with you!");
        }

    }
}
