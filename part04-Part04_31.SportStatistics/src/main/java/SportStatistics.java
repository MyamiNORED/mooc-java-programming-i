
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Name: ");
        String team = scan.nextLine();
        int games = 0 ;
        int wins = 0 ;
        int losses = 0 ;
        try(Scanner openedFile = new Scanner(Paths.get(file))){
            while(openedFile.hasNextLine()){
                String line = openedFile.nextLine();
                String[] parts = line.split(",");
                if(parts[0].compareTo(team)==0){
                    games++;
                    if(Integer.valueOf(parts[2])>= Integer.valueOf(parts[3])){
                        wins++;
                   }
                    else{
                        losses++ ;
                    }
                    
                }else if(parts[1].compareTo(team)==0){
                     games++;
                     if(Integer.valueOf(parts[3])>= Integer.valueOf(parts[2])){
                        wins++;
                   }
                    else{
                        losses++ ;
                    }
                }
                
            }
            
        }catch(Exception e){
            System.out.println("Error: " + e);
        }
        
        System.out.println("Games: "+games);
        System.out.println("Wins: "+wins);
        System.out.println("Losses: "+losses);

    }

}
