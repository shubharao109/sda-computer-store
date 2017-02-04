package com.shubha.project3.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.shubha.project3.Computer;
import com.shubha.project3.Display;
import com.shubha.project3.HardDisk;
import com.shubha.project3.Processor;

public class ComputerTest {

	@Test
	public void testBasic() {
		Computer c = new Computer();
		c.addComponent("Primary HD", new HardDisk("Seagate", 10, "10GB"));
		c.addComponent("Monitor", new Display("LG", 25, "21\""));
		c.addComponent("Processor", new Processor("Inten", 11, "2.2GH"));
		
		assertEquals(c.totalCostOfComponents(), 46);
		
		c.removeComponent("Monitor");
		assertEquals(c.totalCostOfComponents(), 21);

		c.removeComponent("Wrong");
		assertEquals(c.totalCostOfComponents(), 21);

		c.removeComponent("Primary HD");
		assertEquals(c.totalCostOfComponents(), 11);

		c.removeComponent("Processor");
		assertEquals(c.totalCostOfComponents(), 0);
	}

	@Test
	public void testByName() {
		Computer c = new Computer();
		c.addComponent("Primary HD", new HardDisk("Seagate", 10, "10GB"));
		c.addComponent("Monitor", new Display("LG", 25, "21\""));
		c.addComponent("Processor", new Processor("Inten", 11, "2.2GH"));
		c.addComponent("Processor 2", new Processor("Intel", 12, "2.2GH"));
		c.addComponent("Processor 3", new Processor("AMD", 13, "2.2GH"));

		assertEquals(c.totalCostOfComponents(), 71);
		assertEquals(c.totalCostOfComponents("Processor"), 36);
		
		c.removeComponent("Processor");
		assertEquals(c.totalCostOfComponents(), 60);
	}

}
