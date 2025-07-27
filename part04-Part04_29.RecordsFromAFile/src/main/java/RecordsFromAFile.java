
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file: ");
        String file = scanner.nextLine();
        
        try(Scanner openedFile = new Scanner(Paths.get(file))){
            while(openedFile.hasNextLine()){
                String line = openedFile.nextLine();
                String[] parts = line.split(",");
                if(Integer.valueOf(parts[1]) > 1 ||Integer.valueOf(parts[1]) == 0  ){
                    System.out.println(parts[0]+", age: "+parts[1]+" years");
                }
                else{
                    System.out.println(parts[0]+", age: "+parts[1]+" year");

                }

            }
            
        }catch(Exception e){
            System.out.println("Error" + e);
        }
        

    }
}
