package recipts;

public class Step 
{
	private int id;
	private String description;
	
	
	/**
	 * 
	 * @param id : the step number
	 * @param description : description of the step
	 */
	public Step(int id, String description) {
		this.id = id;
		this.description = description;
	}
	
	
	/**
	 * 
	 * @return an integer value of the step id
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
	 * @return a String value of the description of the steps description
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * 
	 * @param description : a new string value to be given to the steps description
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString()
	{
		return "Step "+id+": "+description;
		
	}

}
