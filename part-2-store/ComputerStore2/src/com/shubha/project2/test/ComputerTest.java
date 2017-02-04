package com.shubha.project2.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.shubha.project2.Computer;

public class ComputerTest {

	@Test
	public void testDisplay() {
		Computer c = new Computer();
		c.getTheDisplay().setCost(100);
		assertEquals(c.getTheDisplay().getCost(), 100);
	}
	
	@Test
	public void testHardDisk() {
		Computer c = new Computer();
		c.getTheHardDisk().setCost(50);
		assertEquals(c.getTheHardDisk().getCost(), 50);
	}
	
	@Test
	public void testProcessor() {
		Computer c = new Computer();
		c.getTheProcessor().setCost(150);
		assertEquals(c.getTheProcessor().getCost(), 150);
	}

	@Test
	public void testComputer(){
		Computer c1 = new Computer(10, 100, 1000);
		assertEquals(c1.getTheDisplay().getCost(),10);
		Computer c2 = new Computer(1000, 1000, 1000);
		assertEquals(c2.getTheHardDisk().getCost(),1000);
		Computer c3 = new Computer(1000, 100, 10);
		assertEquals(c3.getTheProcessor().getCost(),10);
	}
}
