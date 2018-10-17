package recipts;

import java.util.ArrayList;
import java.util.List;

public class FoodRecipe 
{
	private  int id=1;
	private String name;
	private List<Ingredients> ingredients;
	private List<Step> steps;
	
	

	/**
	 * 
	 * @param id : an integer value of the FoodRecipe Id
	 * @param name : a String value of the FoodRecipe name
	 */
	public FoodRecipe(int id, String name) 
	{
		this.name = name;
		ingredients = new ArrayList<Ingredients>();
		steps = new ArrayList<Step>();
		this.id=id;
	}
	
	
	/**
	 * 
	 * @param ingredient: the ingredient to be added to the FoodRecipe
	 * @return true if the ingredient has been added, false otherwise
	 * @exception IllegalArgumentException thrown if parameter ingredient is null
	 */
	public boolean addIngredient(Ingredients ingredient) 
	{
		boolean result = false;
		if(ingredient !=null) 
		{
			
			result= ingredients.add(ingredient);
		}

		return result;
	}
	
	/**
	 * 
	 * @param step : the step to be added to the FoodRecipe
	 * @return true if the step has been added, false otherwise
	 */
	public boolean addStep(Step step) 
	{
		if(step !=null) 
		{
			
			return steps.add(step);
		}
		
		return false;
	}
	
	
	
	/**
	 * 
	 * @return an integer value of the FoodRecipe id
	 */
	public int getId() {
		return id;
	}



	/**
	 * 
	 * @param id : an integer new value to be given to the step
	 */
	public void setId(int id) {
		this.id = id;
	}


	/**
	 * 
	 * @return a String value of the FoodRecipesName
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * 
	 * @param name : a String new value to be given to the FoodRecipesName
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 
	 * @return a list of Ingredients of a FoodRecipe
	 */
	public List<Ingredients> getIngredients() {
		return ingredients;
	}
	
	/**
	 * 
	 * @param ingredients: a new list of Ingredients to be added to a FoodRecipe
	 */
	public void setIngredients(List<Ingredients> ingredients) {
		this.ingredients = ingredients;
	}
	
	/**
	 * 
	 * @return a list of steps of a FoodRecipe
	 */
	public List<Step> getSteps() {
		return steps;
	}
	
	/**
	 * 
	 * @param steps: a new list of steps to be added to a FoodRecipe
	 */
	public void setSteps(List<Step> steps) {
		this.steps = steps;
	}
	
	
	
	@Override
	public String toString()
	{
		return "\n FoodRecipe: "+id+". "+name+". \n"+ingredients+"-----------\n"+steps;
	}
	
	
	


}
