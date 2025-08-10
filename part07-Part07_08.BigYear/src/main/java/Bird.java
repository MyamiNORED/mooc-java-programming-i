/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Myami
 */
public class Bird {

    private String name;
    private String nameLatin;
    private int observations ;

    public Bird(String name, String nameLatin) {
        this.name = name;
        this.nameLatin = nameLatin;
        this.observations = 0 ;
    }

    public int getObservations() {
        return observations;
    }

    public void setObservation() {
        this.observations += 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameLatin() {
        return nameLatin;
    }

    public void setNameLatin(String nameLatin) {
        this.nameLatin = nameLatin;
    }

    
    @Override
    public String toString() {
        return this.name+" ("+this.nameLatin+"): "+this.getObservations()+" observations";
    }
    public boolean Equals(Object o) {
    	
    	Bird x = (Bird) o;
    	return this.getObservations() > x.getObservations();
    	
    }

    
}
