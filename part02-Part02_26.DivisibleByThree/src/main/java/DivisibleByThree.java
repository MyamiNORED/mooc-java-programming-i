
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        divisibleByThreeInRange(3, 6);
        divisibleByThreeInRange(2,10);

        


    }

    private static void divisibleByThreeInRange(int a, int b) {
        for(int i = a ; i <= b ; i++){
            
            if(i % 3 == 0){
                System.out.println(i);
            }
        }
    }

}
