
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Myami
 */
public class Room {
    private ArrayList<Person> room;
    public Room(){
        this.room = new ArrayList<>();
    }
    
    public void add(Person person){
        this.room.add(person);
    }
    
    public boolean isEmpty(){
        return this.room.isEmpty();
    }
    public ArrayList<Person> getPersons(){
        return this.room ;
    }
    public Person shortest(){
        if(room.isEmpty()){
            return null;
        }
        Person shortest = room.get(0);
        for(Person x : room){
            if(x.getHeight() < shortest.getHeight()){
                shortest = x;
            }
        }
        return shortest;
    }
    
    public Person take(){
        if(room.isEmpty()){
            return null;
        }
        Person toTake = this.shortest();
        this.room.remove(toTake);
        return toTake;
        
        
    }
    
}
