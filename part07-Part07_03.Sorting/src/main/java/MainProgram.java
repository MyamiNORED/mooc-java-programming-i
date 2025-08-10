
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
    }
    
    public static int smallest(int[] array){
        int small = array[0];
        for(int a : array){
            if(a < small){
                small = a;
            }
        }
        return small;
    }
    
    public static int indexOfSmallest(int[] array){
        int index = 0;
        for(int i  = 0 ; i < array.length; i++){
            if(array[i] < array[index]){
                index = i ;
            }
        }
        return index;
    }
    public static int indexOfSmallestFrom(int[] table , int startIndex){
        int index = startIndex;
        for(int i = index ; i < table.length; i++){
            if(table[i] < table[index]){
                index = i ;
            }
        }
        return index;
    }
    
    

}
