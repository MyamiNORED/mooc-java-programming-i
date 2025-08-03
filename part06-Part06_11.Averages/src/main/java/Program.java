
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        GradeRegister register = new GradeRegister();

        UserInterface ui = new UserInterface(register, scanner);
        System.out.println("program start");
        ui.start();
         
       

    }
}
