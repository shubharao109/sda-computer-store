package com.shubha.project2;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Class ComputerStore: Computer Store will have a collection of computers
 * @author Shubha
 * @version 1.2
 */
public class ComputerStore {
	
	/** The computers. */
	private ArrayList<Computer> computers;

	/**
	 * Instantiates a new computer store.
	 */
	public ComputerStore()
	{
		computers = new ArrayList<>();
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
	public void printAllComputers( ) 
	{
	    // prints out all the details of each computer in store
		for(Computer comp: computers)
		{
			comp.printComputerSummary();
		}
	}

	/**
	 * Prints the total value of all the computers in the store.
	 */
	public void printTotalValue( ) 
	{
	    // prints the total cost for all computers
		int total = 0;
		for (Computer comp: computers)
		{
			total += comp.getTotalPrice();
		}
		System.out.println("The total value of computers: " + total);
	}
	
	/**
	 * Find the most expensive computer V1.
	 * 
	 * @return the computer
	 */
	public Computer findMostExpensiveComputerV1( ) 
	{ 
		if (computers == null || computers.size() == 0) {
			return null;
		}
		//This version will use a traditional for loop
		int currentMostExpensive = computers.get(0).getTotalPrice(), index = 0;
		for(int i = 0; i < computers.size(); i++)
		{
			int total  = computers.get(i).getTotalPrice();
			if (total > currentMostExpensive)
			{
				currentMostExpensive = total;
				index = i;
			}
		}
		return computers.get(index);
	}
	
	/**
	 * Find the most expensive computer V2.
	 * 
	 * @return the computer
	 */
	public Computer findMostExpensiveComputerV2( ) 
	{
		if (computers == null || computers.size() == 0) {
			return null;
		}
		//This version will use a traditional while loop
		int currentMostExpensive = computers.get(0).getTotalPrice(), index = 0, i = 0;
		while(i < computers.size())
		{
			int total  = computers.get(i).getTotalPrice();
			if (total > currentMostExpensive)
			{
				currentMostExpensive = total;
				index = i;
			}
			i++;
		}
		return computers.get(index);
	}
	
	/**
	 * Find the most expensive computer V3.
	 *
	 * @return the computer
	 */
	public Computer findMostExpensiveComputerV3( ) 
	{
		if (computers == null || computers.size() == 0) {
			return null;
		}
		// This version will use a for-each loop
		int currentMostExpensive = computers.get(0).getTotalPrice();
		Computer temp = computers.get(0);
		for(Computer comp: computers)
		{
			int total  = comp.getTotalPrice();
			if (total > currentMostExpensive)
			{
				currentMostExpensive = total;
				temp = comp;
			}
		}
		return temp;
	}
	
	/**
	 * Find most expensive computer V4.
	 *
	 * @return the computer
	 */
	public Computer findMostExpensiveComputerV4( ) 
	{
		if (computers == null || computers.size() == 0) {
			return null;
		}
		//This version will use an Iterator object with a while loop
		Iterator<Computer> it = computers.iterator();
		int currentMostExpensive = computers.get(0).getTotalPrice();
		Computer temp = computers.get(0);
		while(it.hasNext())
		{
			Computer comp = it.next();
			int total  = comp.getTotalPrice();
			if (total > currentMostExpensive)
			{
				currentMostExpensive = total;
				temp = comp;
			}
		}
		return temp;
	}
}
