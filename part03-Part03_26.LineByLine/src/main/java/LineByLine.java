
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        while(true){
        String line = scanner.nextLine();
        if(line.isBlank()){
            break;
        }

            String[] cut = line.split(" ");
            for(String s : cut){
                System.out.println(s);
            }
            
            
        }
        


    }
}
