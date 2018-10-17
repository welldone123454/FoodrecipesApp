package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import recipts.FoodRecipe;
import recipts.Ingredients;
import recipts.RecipesList;
import recipts.Step;

class RecipesListTest {

	private RecipesList recipesList;
	private FoodRecipe foodRecipe;
	private Ingredients ingredient;
	private Step step;
	private int indexOfFirstElementInTheList =0;
	
	@BeforeEach
	void setUp() throws Exception 
	{
		recipesList = new RecipesList();
		
		ingredient = new Ingredients(1, " 2 eggs und 1 litter Milk");
		step = new Step(1,"mix the eggs with the milk");
		foodRecipe =new FoodRecipe(1, "Cake");
		
		foodRecipe.addIngredient(ingredient);
		foodRecipe.addStep(step);
	}
	
	/**
	 * should test if the addFoodRecipe(FoodRecipe) method is apple to add an existing FoodRecipe to an existing RecipeList
	 */
	@Test
	void addFoodRecipeTest() 
	{
		assertTrue(recipesList.addFoodRecipe(foodRecipe));
		
		//compare the size of the recipesList  after invoke of addFoodRecipe(FoodRecipe);
		assertEquals(1, recipesList.getFoodRecipesList().size());
		
		//comparing the saved object with actual object
		assertEquals( recipesList.getFoodRecipesList().get(indexOfFirstElementInTheList).getName(), foodRecipe.getName());
		
		assertEquals( recipesList.getFoodRecipesList().get(indexOfFirstElementInTheList).getSteps().get(indexOfFirstElementInTheList), step);
		
		
	}
	
	/**
	 * should test if the getRecipe(FoodRecipe) method is apple to search and get an existing FoodRecipe of an existing RecipeList
	 */
	@Test
	void getRecipeTest() 
	{
		assertTrue(recipesList.addFoodRecipe(foodRecipe));
		
		//comparing the saved object with actual object
		assertEquals( recipesList.getRecipe(foodRecipe), foodRecipe);
		
		
	}

}
