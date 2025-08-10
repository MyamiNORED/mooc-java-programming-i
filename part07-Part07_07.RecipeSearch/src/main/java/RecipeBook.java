
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Myami
 */
public class RecipeBook {

    private ArrayList<Recipe> recipes;
    Scanner scanner;

    public RecipeBook() {
        this.recipes = new ArrayList<Recipe>();
        this.scanner = new Scanner(System.in);
    }

    public void add(Recipe recipe) {
        this.recipes.add(recipe);
    }

    public void print() {
        for (Recipe r : recipes) {
            System.out.println(r.toString());
        }
    }

    public void read(String file) {

        String name = null;
        int time = 0;
        int counter = 0;
        ArrayList<String> ingrediants = new ArrayList<>();

        try (Scanner scannedFile = new Scanner(Paths.get(file))) {
            while (scannedFile.hasNextLine()) {
                String line = scannedFile.nextLine();
                if (line.isEmpty()) {
                    Recipe n = new Recipe(name, time);
                    for (String x : ingrediants) {
                        n.add(x);
                    }
                    this.recipes.add(n);
                    name = null;
                    time = 0;
                    ingrediants.clear();
                    counter = 0;
                    continue;
                } else if (counter == 0) {
                    name = line;
                    counter++;
                } else if (counter == 1) {
                    time = Integer.valueOf(line);
                    counter++;
                } else {
                    ingrediants.add(line);
                }

            }

        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
            System.exit(1);
        }
        if (name != null) {
            Recipe n = new Recipe(name, time);
            for (String x : ingrediants) {
                n.add(x);
            }
            this.recipes.add(n);
            name = null;
            time = 0;
            ingrediants.clear();
        }

    }

   
    public void searchByName(String name){
        for(int i = 0 ; i < this.recipes.size(); i++) {
        	Recipe t = (Recipe) this.recipes.get(i);
        	String[] parts = t.getName().split(" ");
        	for(String a : parts) {
        		if(a.compareToIgnoreCase(name)== 0 || a.contains(name)){
            		System.out.println(t.toString()) ;}

        		}
        	}
        	
        }
    
    
    
    
    

    public void searchByTime(int time) {
        for (int i = 0; i < this.recipes.size(); i++) {
            Recipe t = (Recipe) this.recipes.get(i);
            if (t.getCookingTime() <= time) {
                System.out.println(t.toString());
            }
        }

    }

    public void searchByIngredient(String ingredient) {
        for (int i = 0; i < this.recipes.size(); i++) {
            Recipe t = (Recipe) this.recipes.get(i);

            if (t.getNameOfEngrediants().contains(ingredient)) {
                System.out.println(t.toString());
            }
        }

    }

}
