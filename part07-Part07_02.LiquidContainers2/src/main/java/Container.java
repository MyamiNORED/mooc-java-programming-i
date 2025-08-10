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

    private  int capacity;
    public Container(){
        this.capacity = 0;
    }
    
    public int contains(){
        return this.capacity;
    }
    public void add(int amount){
        if(amount < 0){
            return ;
        }
        int toAdd = this.capacity + amount ;
        if(toAdd >100 ){
            this.capacity = 100 ;
            return ;
        }
        this.capacity += amount;
        return;
    }
    public void move(int amount, Container b){
        if(amount < 0 || this.capacity ==0 ){
            return;
        }
        int toAdd = this.capacity - amount ;
        if(toAdd < 0){
            b.add(this.capacity);
            this.capacity = 0;
            return;
        }
        this.capacity -= amount;
        b.add(amount);
        return;
        
    }
    
    public void remove(int amount , Container b){
        Container c = new Container();
        move(amount , c);
        return;
    }
    
    
    
    
    public void remove(int amount){
        if (amount < 0){
            return ;
        }
        if((this.capacity - amount) < 0){
            this.capacity = 0;
            return;
        }
        this.capacity -= amount;
        return;
        
    }
    public String toString(){
        return this.capacity + "/100";
    }
}
