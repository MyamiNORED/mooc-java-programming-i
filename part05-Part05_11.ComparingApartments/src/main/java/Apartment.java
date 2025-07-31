
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    public int getSqaures(){
        return this.squares;
        
    }
    public int getPrice(){
        return this.princePerSquare;
    }
    public boolean largerThan(Apartment compared){
        if (this.squares > compared.getSqaures() ){
            return true;
        }
        return false;
    }
    public int priceDifference(Apartment compared){
        int priceThisApp = this.squares * this.getPrice();
        int priceCompared = compared.getSqaures() * compared.getPrice();
        return Math.abs(priceThisApp - priceCompared);
    }
    public boolean moreExpensiveThan(Apartment compared){
        int priceThisApp = this.squares * this.getPrice();
        int priceCompared = compared.getSqaures() * compared.getPrice();
        
        return priceThisApp > priceCompared ;
           
        
    }

}
