
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        /*
        System.out.println("Where to?");
        int num = Integer.valueOf(scanner.nextLine());
        int count = 1 ; 
        while (count <= num){
            System.out.println(count);
            count++ ;
        }*/
        
        //part 2
         // Write your program here
        System.out.println("Where to?");
        int num = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from");
        int numto = Integer.valueOf(scanner.nextLine());
        if(num > numto){
            while(numto <= num){
                System.out.println(numto);
                numto++ ;
            }
        }
        
        
    }
}
