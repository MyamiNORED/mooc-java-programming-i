
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        //write some code here
        int result ;
        if(number1 > number2){
            result = number1;
        }else {
            result = number2;
        }
        if(number2 > number3){
            result = number2;
        }else {
            result = number3;
        }

        return result;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
