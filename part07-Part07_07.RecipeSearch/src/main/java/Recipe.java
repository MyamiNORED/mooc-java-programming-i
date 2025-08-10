
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
public class Recipe {
    public int getCookingTime() {
		return cookingTime;
	}




	public ArrayList<String> getNameOfEngrediants() {
		return nameOfEngrediants;
	}




	public void setNameOfEngrediants(ArrayList<String> nameOfEngrediants) {
		this.nameOfEngrediants = nameOfEngrediants;
	}




	public void setCookingTime(int cookingTime) {
		this.cookingTime = cookingTime;
	}
	private String name;
    private int cookingTime;
    private ArrayList<String> nameOfEngrediants;
    
    
    public Recipe(String name,int time){
        this.name = name;
        this.cookingTime = time;
        this.nameOfEngrediants = new ArrayList<String> ();
        
        
        
    }
    
    
    
    
    public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public Recipe(String name){
        this.name = name;
        this.nameOfEngrediants = new ArrayList<String> ();
    }
    public void add(String ingrediant){
        this.nameOfEngrediants.add(ingrediant);
    }
    public String toString(){
        
        
        return this.name + ", cooking time: "+ this.cookingTime;

                
    }
}
