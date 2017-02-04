package com.shubha.project2;

/**
 * Class Display: Contains the properties of the display device
 * @author Shubha
 * @version 1.2
 */
public class Display {
	
	/** The cost. */
	private int cost;
	
	/** The manufacturer. */
	private String manufacturer;
	
	/** The size. */
	private String size;
	
	/** The resolution. */
	private String resolution;
	
	/** The refresh rate. */
	private String refreshRate;

	/**
	 * Instantiates a new display.
	 */
	public Display() {
		setCost(10);
		setManufacturer("Samsung");
		setSize("27 inches");
		setResolution("1920x1080");
		setRefreshRate("120Hz");
	}
	
	/**
	 * Instantiates a new display.
	 *
	 * @param cost the cost
	 */
	public Display(int cost) {
		setCost(cost);
		setManufacturer("Samsung");
		setSize("27 inches");
		setResolution("1920x1080");
		setRefreshRate("120Hz");
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
	 * Gets the size.
	 *
	 * @return the size
	 */
	public String getSize() {
		return size;
	}

	/**
	 * Sets the size.
	 *
	 * @param size the new size
	 */
	public void setSize(String size) {
		this.size = size;
	}

	/**
	 * Gets the resolution.
	 *
	 * @return the resolution
	 */
	public String getResolution() {
		return resolution;
	}

	/**
	 * Sets the resolution.
	 *
	 * @param resolution the new resolution
	 */
	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	/**
	 * Gets the refresh rate.
	 *
	 * @return the refresh rate
	 */
	public String getRefreshRate() {
		return refreshRate;
	}

	/**
	 * Sets the refresh rate.
	 *
	 * @param refreshRate the new refresh rate
	 */
	public void setRefreshRate(String refreshRate) {
		this.refreshRate = refreshRate;
	}
}
