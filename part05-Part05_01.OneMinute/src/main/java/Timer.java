/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Myami
 */
public class Timer {
    private ClockHand hunredthSec;
    private ClockHand seconds;
    
    public Timer (){
        this.hunredthSec = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }
    public void advance(){
        this.hunredthSec.advance();

        if (this.hunredthSec.value() == 0) {
            this.seconds.advance();

        }
        
    }
    
    
    
    public String toString(){
        return seconds+":" + hunredthSec;
    }





    
}
