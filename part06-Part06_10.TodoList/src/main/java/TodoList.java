
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
public class TodoList {

    private  ArrayList<String> toDos;

    public TodoList() {
        this.toDos = new ArrayList<String>();
    }
    
    
    
    public void add(String task){
        toDos.add(task);
    }
    
    public void print(){
        for(int i = 0 ; i < toDos.size() ; i++){
            System.out.println((i+1) + ": "+ this.toDos.get(i));
        }
    }
            
    public void remove(int number){
        toDos.remove(number -1);
    }
}
