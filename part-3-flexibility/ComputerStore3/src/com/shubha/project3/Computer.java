package com.shubha.project3;
import java.util.HashMap;

/**
 * Class Computer: A computer consisting of display, hard disk and processor is created.
 * @author Shubha
 * @version 1.3
 */
public class Computer {
	
	/** The configuration. */
	private HashMap<String, Component> configuration;
	
	/**
	 * Instantiates a new computer.
	 */
	public Computer() {
		configuration = new HashMap<>();
	}
	
	/**
	 * Adds the component to the computer configuration.
	 *
	 * @param key the key
	 * @param c the c
	 */
	public void addComponent(String key, Component c) {
		configuration.put(key, c);
	}
	
	/**
	 * Removes the component from the computer configuration.
	 *
	 * @param key the key
	 */
	public void removeComponent(String key) {
		configuration.remove(key);
	}

	/**
	 * Total cost of components in the computer.
	 *
	 * @return the total cost
	 */
	public int totalCostOfComponents()
	{
		int total = 0;
		for (Component comp: configuration.values())
		{
			total += comp.getCost();
		}
		return total;
	}
	
	/**
	 * Total cost of components of a specific type in the computer.
	 *
	 * @param component_type the component type
	 * @return the total cost of the named component
	 */
	public int totalCostOfComponents(String component_type)
	{
		int total = 0;
		for(Component comp: configuration.values())
		{
			if (component_type.equalsIgnoreCase("HardDisk")) {
			     if (comp instanceof HardDisk) {
			       total += comp.getCost();
			     }
			  }
			  if (component_type.equalsIgnoreCase("Processor")) {
			     if (comp instanceof Processor) {
			       total += comp.getCost();
			     }
			  }
			  if (component_type.equalsIgnoreCase("Display")) {
			     if (comp instanceof Display) {
			       total += comp.getCost();
			     }
			  }
		}
		return total;
	}
	
	/**
	 * Prints the computer configuration details.
	 */
	public void printComputerSummary() {
		for (Component comp: configuration.values())
		{
			System.out.println(comp.getDescription());
		}
	}

}
