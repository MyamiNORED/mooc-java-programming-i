/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Myami
 */
import java.util.Comparator;

public class SortByObservations implements Comparator<Bird> {
	
	
	    public int compare(Bird a, Bird b) 
	    { 
	        return   b.getObservations() - a.getObservations() ; 
	    } 
	} 




