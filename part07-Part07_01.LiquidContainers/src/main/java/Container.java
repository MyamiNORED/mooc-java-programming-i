/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Myami
 */
public class Container {
    private String name ;
    private int maxCapacity ;

    public Container(String name) {
        this.name = name;
        this.maxCapacity = 0;
    }
    
    public void add (int amount){
        int toAdd = this.maxCapacity + amount ;
        if(toAdd > 100){
        
            this.maxCapacity = 100 ;
            return;
        }
    
        this.maxCapacity += amount ;
    }
    
    public void move (int amount,Container B){
        if(amount > maxCapacity){
            this.maxCapacity = 0;
            B.add(amount);
            return;
        }
        this.maxCapacity -= amount ;
        B.add(amount);
    }
    public void remove (int amount, Container B){ 
        B.move(amount, B);
    }
    public String toString(){
        return this.name +": "+this.maxCapacity+"/100";
    }
}
