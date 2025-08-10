
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container first = new Container();
        Container second = new Container();
  while (true) {
            System.out.println("First: "+first.toString());
            System.out.println("Second: "+second.toString());
 
            String input = scan.nextLine();
            String[] line = input.split(" ");
            if (input.equals("quit")) {
                break;
            }else if(line[0].equals("add")){
                int num = Integer.valueOf(line[1]);
                first.add(num);
            }else if(line[0].equals("move")){
                int num = Integer.valueOf(line[1]);
                first.move(num, second);
            }else if(line[0].equals("remove")){
                int num = Integer.valueOf(line[1]);
                second.remove(num, first);
            }
            
 
        }

         
    }

}
