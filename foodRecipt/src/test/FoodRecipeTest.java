package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import recipts.FoodRecipe;
import recipts.Ingredients;
import recipts.Step;

class FoodRecipeTest {

	private FoodRecipe foodRecipe;
	private Ingredients ingredient;
	private Step step;
	@BeforeEach
	void setUp() throws Exception 
	{
		ingredient = new Ingredients(1, " 2 eggs und 1 litter Milk");
		step = new Step(1,"mix the eggs with the milk");
		foodRecipe =new FoodRecipe(1, "Cake");
	}

	
	/**
	 * should test if the addIngredient(Ingredient) method is apple to add an existing ingredient to an existing FoodRecipe
	 */
	@Test
	public void addIngredientTest() 
	{
		
		assertTrue(foodRecipe.addIngredient(ingredient));
		
		//compare the size of the Ingredients list in a FoodRecipe after invoke of addIngredient(ingredient);
		assertEquals(1, foodRecipe.getIngredients().size());
		
		//comparing the saved object with actual object
		assertEquals(foodRecipe.getIngredients().get(0).getDescription(), ingredient.getDescription());
		
	}
	
	
	/**
	 * should test if the addIngredient(Ingredient) method is apple  refuse the illegalArguments
	 */
	@Test
	public void addIngredientTest2() 
	{
		ingredient = null;
		assertFalse(foodRecipe.addIngredient(ingredient));
		
	}
	
	
	/**
	 * should test if the addStep(Step) method is apple to add an existing step to an existing FoodRecipe
	 */
	@Test
	public void addStepTest() 
	{
		assertTrue(foodRecipe.addStep(step));
		
		//compare the size of the Steps list in a FoodRecipe after invoke of addStep(Step);
		assertEquals(1, foodRecipe.getSteps().size());
		
		//comparing the saved object with actual object
		assertEquals(foodRecipe.getSteps().get(0).getDescription(), step.getDescription());
				
	}
	
	/**
	 * should test if the addStep(Step) method is apple  refuse the illegalArguments
	 */
	@Test
	public void addStepTest2() 
	{
		step = null;
		assertFalse(foodRecipe.addStep(step));
		
	}
	
	
}
