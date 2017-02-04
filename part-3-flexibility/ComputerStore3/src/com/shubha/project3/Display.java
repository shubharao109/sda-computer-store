package com.shubha.project3;

/**
 * Class Display: Contains the properties of the display device
 * @author Shubha
 * @version 1.3
 */
public class Display extends Component {
	
	/** The size. */
	private String size;

	/**
	 * Instantiates a new display.
	 *
	 * @param manufacturer the manufacturer
	 * @param cost the cost
	 * @param size the size
	 */
	public Display(String manufacturer, int cost, String size) {
		super(cost, manufacturer);
		setSize("27 inches");
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
	
	/* (non-Javadoc)
	 * @see com.shubha.project3.Component#getDescription()
	 */
	public String getDescription() {
		return super.getDescription() +
				" Display Details: Size: " + getSize();
	}
}
