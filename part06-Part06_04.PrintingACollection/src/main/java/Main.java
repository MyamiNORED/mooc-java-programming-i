
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        //ComparisonFailure: When the code was:
        //ComparisonFailure: When the code was:
        SimpleCollection c = new SimpleCollection("collection");
        c.add("element");
        System.out.println(c);
        /*
        Expected output:
        The collection collection has 1 element:
        element

Currently output is:
The collection collection has 1 element:
element
 expected:<...s 1 element:  
        element[]> 
  but was:<...s 1 element:
        element[]
        
        >*/
    }
}
