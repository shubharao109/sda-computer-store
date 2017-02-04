package com.shubha.project3;

/**
 * Class HardDisk: Contains the properties of hard disk
 * @author Shubha
 * @version 1.3
 */
public class HardDisk extends Component{
	
	/** The capacity. */
	private String capacity;
	
	/**
	 * Instantiates a new hard disk.
	 *
	 * @param manufacturer the manufacturer
	 * @param cost the cost
	 * @param capacity the capacity
	 */
	public HardDisk(String manufacturer, int cost, String capacity) {
		super(cost, manufacturer);
		setCapacity(capacity);
	}

	/**
	 * Gets the capacity.
	 *
	 * @return the capacity
	 */
	public String getCapacity() {
		return capacity;
	}

	/**
	 * Sets the capacity.
	 *
	 * @param capacity the new capacity
	 */
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	
	/* (non-Javadoc)
	 * @see com.shubha.project3.Component#getDescription()
	 */
	public String getDescription() {
		return super.getDescription() +
				" Hard Disk Details: Capacity: " + getCapacity();
	}
}
