
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String line = scanner.nextLine();
            if(line.isEmpty()){
                break;
            }
            
            String[] cut = line.split(" ");
            for(String a : cut){
                if(a.contains("av")){
                    System.out.println(a);
                }
            }
            
        }


    }
}
