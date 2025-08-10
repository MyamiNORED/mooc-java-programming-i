
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        BirdObservations phoenix = new BirdObservations();
        
        while(true){
            System.out.print("? ");
            String input = scan.nextLine();
            
            if(input.equals("Quit")){
                break;
            }else if (input.equals("Add")){
                System.out.print("Name: ");
                String name = scan.nextLine();
                System.out.println("Name in Latin: ");
                String latinName = scan.nextLine();
                phoenix.add(new Bird(name,latinName));
                
                
            }else if (input.equals("Observation")){
                System.out.print("Bird? ");
                String name = scan.nextLine();
                phoenix.addObservation(name);
                
            }else if (input.equals("One")){
                System.out.print("Bird? ");
                String name = scan.nextLine();
                System.out.print(phoenix.printOne(name));
            }else if (input.equals("All")){
                phoenix.printAll();
            }
            
            
        }

    }

}
