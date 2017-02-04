package com.shubha.project3;

/**
 * Class Processor: Contains details of a processor
 * @author Shubha
 * @version 1.3
 */
public class Processor extends Component {
	
	/** The speed. */
	private String speed;
	
	/**
	 * Instantiates a new processor.
	 *
	 * @param manufacturer the manufacturer
	 * @param cost the cost
	 * @param speed the speed
	 */
	public Processor(String manufacturer, int cost, String speed) {
		super(cost, manufacturer);
		setSpeed(speed);
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
	
	/* (non-Javadoc)
	 * @see com.shubha.project3.Component#getDescription()
	 */
	public String getDescription() {
		return super.getDescription() +
				" Processor Details: " +
				" Speed: " + getSpeed();
	}
}
