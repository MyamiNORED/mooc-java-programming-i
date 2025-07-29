/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Myami
 */
public class Cube {
    private int edgeLength;
    public Cube(int edgeLength){
        this.edgeLength = edgeLength;
    }
    public int volume(){
        return  edgeLength * edgeLength * edgeLength ;
    }
    public String toString(){
        return "The length of the edge is "+this.edgeLength+" and the volume "+volume(); 
    }
    
    
    /*

Make a public int volume() method for the cube, which calculates and returns the cube's volume. 
    The volume of the cube is calculated with the formula edgeLength * edgeLength * edgeLength. 
    Moreover, make a public String toString() method for the cube, which returns a string representation of it. 
    The string representation should take the form "",
    where l is the length and v the volume - both the length and volume must be represented as integers.
    */
    
}
