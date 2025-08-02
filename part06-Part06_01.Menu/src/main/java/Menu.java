
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    // implement the required methods here
    public void addMeal(String meal) {
        //adds a meal to the menu. If the meal is already on the list, it should not be added again.
        if(meals.contains(meal)){
            return;
        }
        meals.add(meal);
    }

    public void printMeals() {
        //prints the meals.
        for(String a : meals){
            System.out.println(a);
        }
    }

    public void clearMenu() {
        //clears the menu.
        meals.clear();
    }
}
