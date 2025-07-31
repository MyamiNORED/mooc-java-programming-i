
public class Main {

    public static void main(String[] args) {
        // write experimental main programs here

       //Adding a negative amount should neither change the balance on the card nor the money in the terminal! Check the code:
       PaymentTerminal terminal = new PaymentTerminal(); 
       PaymentCard card = new PaymentCard(10);
       terminal.addMoneyToCard(card, -10);
       card.balance() ;//expected:<10.0> but was:<0.0>
    }
}
