
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
public class Hold {
    private int maximumWeight;
    private ArrayList<Suitcase> hold ;

    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.hold = new ArrayList<>();
    }
    public int totalWeightHold(){
        int total = 0;
        for(Suitcase s : hold){
            total += s.totalWeight();
        }
        return total;
    }
    
    public void addSuitcase(Suitcase suitcase){
        
        int weightToAdd = suitcase.totalWeight() + totalWeightHold();
        if (weightToAdd > this.maximumWeight){
            return;
        }
        hold.add(suitcase);
    }
    public String toString(){
        
        return this.hold.size()+ " suitcases ("+ this.totalWeightHold() + " kg)";
    }
    public void printItems() {
        for(Suitcase x : hold){
            
            x.printItems();
        }
    }
    
    
    
    
}
