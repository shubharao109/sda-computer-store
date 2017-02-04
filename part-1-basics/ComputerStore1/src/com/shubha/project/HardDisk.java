package com.shubha.project;

/**
 * Class HardDisk: Contains the properties of hard disk
 * @author Shubha
 * @version 1.1
 */
public class HardDisk {
	
	/** The cost. */
	private int cost;
	
	/** The manufacturer. */
	private String manufacturer;
	
	/** The capacity. */
	private String capacity;
	
	/** The serial number. */
	private String serialNumber;

	/**
	 * Instantiates a new hard disk.
	 */
	public HardDisk() {
		setCost(500);	
		setManufacturer("Kingston");
		setCapacity("1TB");
		setSerialNumber("0000000012400917BA30");
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

	/**
	 * Gets the serial number.
	 *
	 * @return the serial number
	 */
	public String getSerialNumber() {
		return serialNumber;
	}

	/**
	 * Sets the serial number.
	 *
	 * @param serialNumber the new serial number
	 */
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
}
