
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String s = scan.nextLine();
        System.out.println("Give an integer:");
        int n = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double d= Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean b = Boolean.valueOf(scan.nextLine());
        System.out.println("You gave the string "+s+"\n" +
                            "You gave the integer "+n+"\n" +
                            "You gave the double "+d+"\n" +
                            "You gave the boolean "+b);
        

    }
}
