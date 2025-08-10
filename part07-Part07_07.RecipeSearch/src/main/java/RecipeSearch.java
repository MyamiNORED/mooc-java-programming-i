
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("File to read: ");

		RecipeBook chomicha = new RecipeBook();

		String file = scanner.nextLine();

		chomicha.read(file);
		System.out.println("Commands:\n" + "list - lists the recipes\n" + "stop - stops the program\n"
				+ "find name - searches recipes by name\n" + "find cooking time - searches recipes by cooking time\n"
				+ "find ingredient - searches recipes by ingredient\n");

		while (true) {
			System.out.print("Enter command:  ");
			String input = scanner.nextLine();
			if (input.equals("list")) {
				System.out.println("Recipes:");
				chomicha.print();
			} else if (input.equals("stop")) {
				break;
			} else if (input.equals("find name")) {
				System.out.print("Searched word: ");
				String name = scanner.nextLine();
                                
				chomicha.searchByName(name);
			} else if (input.equals("find cooking time")) {
				System.out.print("Max cooking time: ");
				int time = Integer.valueOf(scanner.nextLine());
				System.out.println("Recipes:");
				chomicha.searchByTime(time);
			} else if (input.equals("find ingredient")) {
				System.out.print("Ingredient: ");
				String ingredient = scanner.nextLine();
				System.out.println("Recipes:");
				chomicha.searchByIngredient(ingredient);
			}
		}

	}

}
