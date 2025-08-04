
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Myami
 */
public class JokeManager {
    private ArrayList<String> jokes ;
    public JokeManager(){
        this.jokes = new ArrayList<String>();
    }

    public void addJoke(String joke){
        this.jokes.add(joke);
    }
            
    public String drawJoke(){
        int size = jokes.size() ;
        if(size ==0 ){
            return "Jokes are in short supply." ;
        }
       
         int rand = (int) (Math.random() * 10)%2 ;
        
        return jokes.get(rand);
        
    }

    public void printJokes(){
        for (String joke : jokes){
            System.out.println(joke);
        }
    }
}
