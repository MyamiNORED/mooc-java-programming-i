
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Myami
 */
public class BirdObservations {
    
    ArrayList<Bird> observations ;
    public BirdObservations(){
        this.observations = new ArrayList<Bird> ();
    }
    public void add(Bird bird){
        this.observations.add(bird);
    }
    public void addObservation(String name ){
        boolean found= false;
        for(Bird r : observations){
            if(r.getName().equals(name)){
                r.setObservation();
                found = true;
            }
        }
        if(!found){
            System.out.println("Not a bird!");
        }
    }
    public  void printAll(){
    	Collections.sort(this.observations, new SortByObservations()); 
        for (Bird r : observations){
            System.out.println(r.toString());
        }
    }
    public String  printOne(String name){
        String bird = "Not a bird!\n";
        for (Bird r : observations){
            if(r.getName().equals(name)){
                bird = r.toString()+"\n";
                break;
            }
           
        }
        return bird;
        
    }
}
