package com.shubha.project3;

/**
 * Class Component: Contains details of computer components
 * @author Shubha
 * @version 1.3
 */
public class Component {

	/** The cost. */
	private int cost;
	
	/** The manufacturer. */
	private String manufacturer;
	
	public Component (int cost, String manufacturer)
	{
		setCost(cost);
		setManufacturer(manufacturer);
	}
	/**
	 * Gets the cost.
	 *
	 * @return the cost
	 */
	public int getCost() {
		return cost;
	}
	
	/**
	 * Sets the cost.
	 *
	 * @param cost the new cost
	 */
	public void setCost(int cost) {
		if(cost > 0)
			this.cost = cost;
	}
	
	/**
	 * Gets the manufacturer.
	 *
	 * @return the manufacturer
	 */
	public String getManufacturer() {
		return manufacturer;
	}
	
	/**
	 * Sets the manufacturer.
	 *
	 * @param manufacturer the new manufacturer
	 */
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	/**
	 * Gets the description of the component.
	 *
	 * @return the description
	 */
	public String getDescription() {
		return "Component Details: Cost: " + getCost() + " Manufacturer: " + getManufacturer();
	}
}
