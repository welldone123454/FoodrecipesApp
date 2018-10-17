package recipts;

public class Ingredients 
{
	private  int id;
	private String description;
	
	
	/**
	 * 
	 * @param id : the Ingredient number
	 * @param description : description of the Ingredient
	 */
	public Ingredients(int id, String description) {
		this.id =id;
		this.description = description;
	}
	
	
	
	/**
	 * 
	 * @return an integer value of the Ingredient id
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * 
	 * @param id : an integer new value to be given to the Ingredient
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * 
	 * @return a String value of the description of the Ingredients description
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * 
	 * @param description : a new string value to be given to the Ingredients description
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	@Override
	public String toString()
	{
		return "Ingredient "+id+": "+description;
	}
	

}
