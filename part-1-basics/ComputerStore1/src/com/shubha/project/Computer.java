package com.shubha.project;

/**Class Computer: A computer consisting of display, hard disk and processor is created.
 * @author Shubha
 * @version 1.1
 */
public class Computer {
	/**
	 * Components of a computer.
	 */
	private Display theDisplay;
	private HardDisk theHardDisk;
	private Processor theProcessor;
	
	/**
	 * Instantiates a new computer.
	 */
	public Computer() {
		theDisplay = new Display();
		theHardDisk = new HardDisk();
		theProcessor = new Processor();
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
	}
}
