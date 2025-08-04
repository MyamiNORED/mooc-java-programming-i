
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container a = new Container("First");
        Container b = new Container("Second");

        while (true) {

            String input = scan.nextLine();
            if (input.equals("quit")) {
                System.out.println(a.toString());
                System.out.println(b.toString());
                break;
            }
            String[] line = input.split(" ");

            if (line[0].equals("add")) {

                int num = Integer.valueOf(line[1]);
                a.add(num);

            }
            System.out.println(a.toString());
            System.out.println(b.toString());

        }
    }

}
