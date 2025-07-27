
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        boolean found = true;
        try(Scanner open = new Scanner(Paths.get(file))){
            while(open.hasNextLine()){
                String name = open.nextLine();
                if(name.compareTo(searchedFor)==0){
                    System.out.println("Found!");
                    found = true;
                    break;
                }
                else{
                    found = false;
                }
                
            }
        }catch(Exception e){
            System.out.println("Reading the file " + file + " failed.");
        }
        if(!found){
            System.out.println("Not found.");
        }
    }
}
