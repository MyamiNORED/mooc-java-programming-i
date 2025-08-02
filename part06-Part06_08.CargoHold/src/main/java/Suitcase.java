
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
public class Suitcase {
    ArrayList<Item> suitcase ;
    private int maximumWeight;

    public Suitcase(int maximumWeight) {
        this.suitcase = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }
    
    public void addItem(Item item){
        int weightToAdd = item.getWeight() +  totalWeight() ;
        if(weightToAdd > maximumWeight){
            return;
        }
        
        suitcase.add(item);
    }
    public int totalWeight(){
         int weight = 0;
        for(Item a : suitcase){
            weight += a.getWeight();
        }
        return weight;
    }
    
    public void printItems (){
        for (Item a : suitcase){
            System.out.println(a.toString());
        }
    }
    
    public Item heaviestItem (){
        if(suitcase.isEmpty()){
            return null ;
        }
        Item h = suitcase.get(0);
        for(Item a : suitcase){
            if(a.getWeight() > h.getWeight()){
                h = a;
            }
        }
        return h ;
    }
    
    
    
    
    
    
    
    
    
    public String toString(){
       if(suitcase.isEmpty()){
           return "no items (0 kg)";
       }
        if(suitcase.size() ==1 ){
           return "1 item ("+ totalWeight() +" kg)";
        }
        
        
        
       return suitcase.size()+" items ("+ totalWeight() +" kg)";


    }
    
    
    
    
}
