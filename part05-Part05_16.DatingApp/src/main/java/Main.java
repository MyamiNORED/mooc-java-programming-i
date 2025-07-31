
public class Main {

    public static void main(String[] args) {
        // test your program here!
        //ComparisonFailure: Check that calling the advance method advances the date by one. 
        //When you create an object
        SimpleDate date = new SimpleDate(30, 12, 2011); 
        //and call the method 
        date.advance() ;
        //once, the date should be 1.1.2012.
        //expected:<[1].1.2012> but was:<[0].1.2012>
        
        System.out.println(date.toString());
    }
}
