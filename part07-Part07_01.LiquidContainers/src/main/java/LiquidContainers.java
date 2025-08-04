
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container a = new Container("First");
        Container b = new Container("Second");

        while (true) {
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            System.out.println(a.toString());
            System.out.println(b.toString());
            if (input.equals("add")) {
                System.out.println("add ");
                int num = Integer.valueOf(scan.nextLine());
                a.add(num);
                System.out.println(a.toString());
                System.out.println(b.toString());
            }

        }
    }

}
