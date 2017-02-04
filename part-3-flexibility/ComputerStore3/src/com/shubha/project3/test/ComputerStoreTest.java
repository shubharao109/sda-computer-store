package com.shubha.project3.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.shubha.project3.Component;
import com.shubha.project3.Computer;
import com.shubha.project3.ComputerStore;
import com.shubha.project3.Display;
import com.shubha.project3.HardDisk;
import com.shubha.project3.Processor;

public class ComputerStoreTest {
	
	@Test
	public void testComputerStore() {
		//Testing adding, removing components from the store
		ComputerStore cs1 = new ComputerStore();
		Component c1 = new HardDisk("Kingston", 100, "100GB");
		Component c2 = new Display("Samsung", 55, "27\"");
		cs1.addComponent(c1);
		cs1.addComponent(c2);
		assertEquals(cs1.totalCostOfComponents(), 155);
		assertEquals(cs1.totalCostOfComponents("Display"), 55);


		//Testing adding, removing computers from the store
		Computer comp1 = new Computer();
		Computer comp2 = new Computer();
		comp1.addComponent("Primary HD", new HardDisk("Seagate", 10, "10GB"));
		comp2.addComponent("Monitor", new Display("LG", 25, "21\""));
		comp1.addComponent("Processor", new Processor("Inten", 11, "2.2GH"));
		comp2.addComponent("Processor 2", new Processor("Intel", 12, "2.2GH"));
		comp1.addComponent("Processor 3", new Processor("AMD", 13, "2.2GH"));
		cs1.addComputer(comp1);
		cs1.addComputer(comp2);

		assertEquals(2, cs1.size());

		// Cannot remove beyond the last one
		cs1.removeComputer(2);
		assertEquals(2, cs1.size());

		cs1.removeComputer(1);
		assertEquals(1, cs1.size());
		cs1.removeComputer(0);
		assertEquals(0, cs1.size());
	}
}
