package com.shubha.project3;
import java.util.ArrayList;

/**
 * Class ComputerStore: Computer Store will have a collection of computers
 * @author Shubha
 * @version 1.3
 */
public class ComputerStore {
	
	/** The computers. */
	private ArrayList<Computer> computers;
	/** The components. */
	private ArrayList<Component> components;

	/**
	 * Instantiates a new computer store.
	 */
	public ComputerStore()
	{
		computers = new ArrayList<>();
		components = new ArrayList<>();
	}
	
	/**
	 * Adds a computer to the collection.
	 *
	 * @param newComputer the new computer
	 * @return true, if successful
	 */
	public boolean addComputer(Computer newComputer) 
	{ 
		if(newComputer != null)
		{
			computers.add(newComputer);
			return true;
		}
		return false;
	}

	/**
	 * Removes the computer from collection.
	 *
	 * @param index the index
	 * @return true, if successful
	 */
	public boolean removeComputer(int index) 
	{ 
		try{
			computers.remove(index);	
		} 
		catch (IndexOutOfBoundsException e) {
			return false;
		}
		return true;
	}

	/**
	 * Prints all the computers in the store.
	 */
	public void printAllComputers() {
	    // prints out all the details of each computer in store
		for(Computer comp: computers) {
			comp.printComputerSummary();
		}
	}
	
	/**
	 * Adds an individual component to the collection.
	 *
	 * @param c the component
	 */
	public void addComponent(Component c) {
		components.add(c);
	}
	
	/**
	 * Removes a component from the collection.
	 *
	 * @param c the component
	 */
	public void removeComponent(Component c) {
		components.remove(c);
	}
	
	/**
	 * Total cost of components in the store.
	 *
	 * @return the int
	 */
	public int totalCostOfComponents() {
		int total = 0;
		for (Component comp: components) {
			total += comp.getCost();
		}
		return total;
	}
	
	/**
	 * Total cost of components of a specific type in the store.
	 *
	 * @param component_type the component type
	 * @return the int
	 */
	public int totalCostOfComponents(String component_type) {
		int total = 0;
		for(Component comp: components) {
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

	public int size() {
		return computers.size();
	}
}