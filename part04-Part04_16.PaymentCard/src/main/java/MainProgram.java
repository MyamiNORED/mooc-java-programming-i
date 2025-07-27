
public class MainProgram {

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);

        // Here you can write code to test that PaymentCard works as intended
        // be sure to erase the extra code for the last part of the exercise!
//        // write code here
//        Create Paul's card. The opening balance of the card is 20 euros
        PaymentCard paulsCard = new PaymentCard(20);

//        Create Matt's card. The opening balance of the card is 30 euros
        PaymentCard mattsCard = new PaymentCard(30);

//        Paul eats heartily
        paulsCard.eatHeartily();
//        Matt eats affordably
        mattsCard.eatAffordably();
//        The cards' values ​​are printed (each on its own line, with the cardholder name at the beginning of it)
        System.out.println("Paul: " + paulsCard.toString());
        System.out.println("Matt: " + mattsCard.toString());
//        Paul tops up 20 euros
        paulsCard.addMoney(20);
//        Matt eats heartily
        mattsCard.eatHeartily();
//        The cards' values ​​are printed (each on its own line, with the cardholder name at the beginning of it)
        System.out.println("Paul: " + paulsCard.toString());
        System.out.println("Matt: " + mattsCard.toString());
//        Paul eats affordably
        paulsCard.eatAffordably();
//        Paul eats affordably
        paulsCard.eatAffordably();

//        Matt tops up 50 euros
        mattsCard.addMoney(50);
//        The cards' values ​​are printed (each on its own line, with the cardholder name at the beginning of it)
//        
        System.out.println("Paul: " + paulsCard.toString());
        System.out.println("Matt: " + mattsCard.toString());
    }
}
