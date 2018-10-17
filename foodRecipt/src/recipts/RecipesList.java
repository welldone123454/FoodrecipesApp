package recipts;

import java.util.ArrayList;
import java.util.List;

public class RecipesList 
{
	private List<FoodRecipe> foodRecipesList;
	private static int id;
	
	

	public RecipesList() 
	{
		foodRecipesList= new ArrayList<FoodRecipe>();
		id=1;
	}
	
	
	/**
	 * 
	 * @param foodRecipe a new FoodRecipe to be added to the list of FoodRecipesList
	 * @return true if the step has been added, false otherwise
	 */
	public boolean addFoodRecipe(FoodRecipe foodRecipe) 
	{
		if(foodRecipe !=null) 
		{
			return foodRecipesList.add(foodRecipe);
		}
		
		return false;
	}
	
	
	
	
	/**
	 * create a prepared FoodRecipeList
	 */
	public void createStartList() 
	{
		//first Food Recipe
		FoodRecipe r1 = new FoodRecipe(1,"Cake");
		r1.addIngredient(new Ingredients(1, "2 eggs, Misc \n 1 lb Flour, Baking"));
		r1.addStep(new Step(1,"Mix the 2 eggs with baking powder"));
		r1.addStep(new Step(2,"Bake in the centre of the oven for 25-30 ") );
		addFoodRecipe(r1);
		
		//Second Food recipes
		FoodRecipe r2 = new FoodRecipe(2,"Fried Potato");
		r2.addIngredient(new Ingredients(1, "2 Kg potato, 2 Liter oil"));
		r2.addStep(new Step(1,"Peeling potatoes and throw it in the oil for 10 min"));
		addFoodRecipe(r2);

		//Third recipes
		FoodRecipe r3 = new FoodRecipe(3,"Milk Ice Cream");
		r3.addIngredient(new Ingredients(1, "1 litter fresh milk"));
		r3.addStep(new Step(1,"Mix milk with suger and keep it in the freezer for 3 Hours"));
		addFoodRecipe(r3);
		
	}
	

	/**
	 * prints all FoodRecipes in the foodRecipesList
	 */
	public void printList() 
	{
		if(foodRecipesList!=null && !foodRecipesList.isEmpty()) 
		{
			for(int i = 0; i<foodRecipesList.size(); i++) 
			{
				System.out.println(foodRecipesList.get(i));
			}
		}

	}
	
	/**
	 * prints and returns a FoodRecipes value  recipesName if available
	 * @param recipesName the name of the foodRecipes to be printed
	 * @return a FoodRecipes value  recipesName if available in the foodRecipesList else return null.
	 */
	public FoodRecipe printRecipe(String recipesName) 
	{
		FoodRecipe result=null;
		if(foodRecipesList!=null && !foodRecipesList.isEmpty()) 
		{
			for(int i=0; i<foodRecipesList.size(); i++) 
			{
				if(foodRecipesList.get(i).getName().equalsIgnoreCase(recipesName)) 
				{
					result =foodRecipesList.get(i);
					System.out.println(result);
				}
			}
		}

		
		return result;
	}
	
	/**
	 * 
	 * @param recipesName the name of the foodRecipes to be printed
	 * @return a FoodRecipes value  recipesName if available in the foodRecipesList else return null.
	 */
	public FoodRecipe getRecipe(FoodRecipe foodRecipe) 
	{
		FoodRecipe result=null;
		if(foodRecipe !=null) 
		{
			for(int i=0; i<foodRecipesList.size(); i++) 
			{
				if(foodRecipesList.get(i).getName().equalsIgnoreCase(foodRecipe.getName())) 
				{
					result =foodRecipesList.get(i);
				}
			}
		}
		
		return result;
	}
	
	/**
	 * 
	 * @return a list of FoodRecipes
	 */
	public List<FoodRecipe> getFoodRecipesList() {
		return foodRecipesList;
	}
	
	
	/**
	 * 
	 * @param foodRecipesList a new FoodRecipes
	 */
	public void setFoodRecipesList(List<FoodRecipe> foodRecipesList) {
		this.foodRecipesList = foodRecipesList;
	}
	
	/**
	 * 
	 * @return an integer value of the foodRecipesList id
	 */
	public static int getId() {
		return id;
	}
	
	/**
	 * 
	 * @param id : an integer new value to be given to the foodRecipesList
	 */
	public static void setId(int id) {
		RecipesList.id = id;
	}
	
	
	

}
