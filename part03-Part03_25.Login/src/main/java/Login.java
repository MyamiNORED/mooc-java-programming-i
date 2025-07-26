
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String username = scanner.nextLine();
        String password = scanner.nextLine();
        boolean login1 = (0 == username.compareTo("alex")) && (0 == password.compareTo("sunshine")) ; 
        boolean login2 = (0 == username.compareTo("emma")) && (0 == password.compareTo("haskell")) ; 

        
        if(login1 || login2){
            System.out.println("You have successfully logged in!");
        }
        else{
            System.out.println("Incorrect username or password!");
        }
        
        

    }
}
