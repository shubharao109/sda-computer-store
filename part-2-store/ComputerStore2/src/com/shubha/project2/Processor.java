package com.shubha.project2;

/**
 * Class Processor: Contains details of a processor
 * @author Shubha
 * @version 1.2
 */
public class Processor {
	
	/** The cost. */
	private int cost;
	
	/** The manufacturer. */
	private String manufacturer;
	
	/** The model. */
	private String model;
	
	/** The speed. */
	private String speed;
	
	/** The type. */
	private String type;

	/**
	 * Instantiates a new processor.
	 */
	public Processor() {
		setCost(10);
		setManufacturer("Intel(R)");
		setModel("Core(TM) i7-2600");
		setSpeed("3.4GHz");
		setType("x-64 based processor");
	}
	
	/**
	 * Instantiates a new processor.
	 *
	 * @param cost the cost
	 */
	public Processor(int cost) {
		setCost(cost);
		setManufacturer("Intel(R)");
		setModel("Core(TM) i7-2600");
		setSpeed("3.4GHz");
		setType("x-64 based processor");
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
		if (cost > 0)
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
	 * Gets the model.
	 *
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * Sets the model.
	 *
	 * @param model the new model
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * Gets the speed.
	 *
	 * @return the speed
	 */
	public String getSpeed() {
		return speed;
	}

	/**
	 * Sets the speed.
	 *
	 * @param clockSpeed the new speed
	 */
	public void setSpeed(String clockSpeed) {
		this.speed = clockSpeed;
	}

	/**
	 * Gets the type.
	 *
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * Sets the type.
	 *
	 * @param type the new type
	 */
	public void setType(String type) {
		this.type = type;
	}
}
