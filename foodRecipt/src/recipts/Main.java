package recipts;

public class Main {
	
	/*
	 * an APP of nutrition that would help the user to organize their Food Recipes
	 * user should be able to see a saved food recipes print or add new recipes
	 */
	

	public static void main(String[] args) {
		RecipesList recipesList = new RecipesList();
		
		recipesList.createStartList();
		
		recipesList.printList();
		
		recipesList.printRecipe("Fried Potato");
		

	}

}
