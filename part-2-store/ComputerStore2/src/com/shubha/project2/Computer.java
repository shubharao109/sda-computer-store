package com.shubha.project2;

/**Class Computer: A computer consisting of display, hard disk and processor is created.
 * @author Shubha
 * @version 1.2
 */
public class Computer {
	
	/** The display. */
	private Display theDisplay;

	/** The hard disk. */
	private HardDisk theHardDisk;
	
	/** The processor. */
	private Processor theProcessor;
	
	/** Gets the display
	 * @return the display
	 */
	public Display getTheDisplay() {
		return theDisplay;
	}

	/** Sets the display
	 * @param theDisplay
	 */
	public void setTheDisplay(Display theDisplay) {
		this.theDisplay = theDisplay;
	}

	/** Gets the hard disk
	 * @return the hard disk
	 */
	public HardDisk getTheHardDisk() {
		return theHardDisk;
	}

	/** Sets the hard disk
	 * @param theHardDisk
	 */
	public void setTheHardDisk(HardDisk theHardDisk) {
		this.theHardDisk = theHardDisk;
	}

	/** Gets the processor
	 * @return the processor
	 */
	public Processor getTheProcessor() {
		return theProcessor;
	}

	/** Sets the processor
	 * @param theProcessor
	 */
	public void setTheProcessor(Processor theProcessor) {
		this.theProcessor = theProcessor;
	}
	
	/**
	 * Instantiates a new computer.
	 */
	public Computer() {
		theDisplay = new Display();
		theHardDisk = new HardDisk();
		theProcessor = new Processor();
	}
	
	/**
	 * Instantiates a new computer with specified costs
	 */
	public Computer(int displayCost, int hardDiskCost, int processorCost) {
		theDisplay = new Display(displayCost);
		theHardDisk = new HardDisk(hardDiskCost);
		theProcessor = new Processor(processorCost);
	}
	
	/** Computes the total price of a computer
	 * @return the total price of a computer
	 */
	public int getTotalPrice()
	{
		return getTheDisplay().getCost() 
					+ getTheHardDisk().getCost() 
					+ getTheProcessor().getCost();
	}

	/**
	 * Prints the details of the computer.
	 */
	public void printComputerSummary() {
		
		System.out.println("The processor details:");
		System.out.println("Cost: " + theProcessor.getCost());
		System.out.println("Manufacturer: " + theProcessor.getManufacturer());
		System.out.println("Model: " + theProcessor.getModel());
		System.out.println("Speed: " + theProcessor.getSpeed());
		System.out.println("Type: " + theProcessor.getType());
		System.out.println();
		
		System.out.println("The display details:");
		System.out.println("Cost: " + theDisplay.getCost());
		System.out.println("Manufacturer: " + theDisplay.getManufacturer());
		System.out.println("Size: " + theDisplay.getSize());
		System.out.println("Manufacturer: " + theDisplay.getResolution());
		System.out.println("Refresh Rate: " + theDisplay.getRefreshRate());
		System.out.println();
		
		System.out.println("The hard disk details:");
		System.out.println("Cost: " + theHardDisk.getCost());
		System.out.println("Manufacturer: " + theHardDisk.getManufacturer());
		System.out.println("Capacity: " + theHardDisk.getCapacity());
		System.out.println("Serial Number: " + theHardDisk.getSerialNumber());
		System.out.println();
	}
}
