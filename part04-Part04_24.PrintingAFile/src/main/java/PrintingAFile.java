
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {

    public static void main(String[] args) {
        try(Scanner s = new Scanner(Paths.get("data.txt"))){
            while(s.hasNextLine()){
                String line = s.nextLine();
                System.out.println(line);
            }
        }catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        

    }
}
