package com.shubha.project2.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.shubha.project2.Computer;
import com.shubha.project2.ComputerStore;

public class ComputerStoreTest {

	@Test
	public void testComputerStore() {
		Computer c1 = new Computer(10, 100, 1000);
		Computer c2 = new Computer(1000, 1000, 1000);
		Computer c3 = new Computer(1000, 100, 10);
		ComputerStore cs1 = new ComputerStore();
		assertEquals(cs1.addComputer(c1), true);
		assertEquals(cs1.addComputer(c2), true);
		assertEquals(cs1.addComputer(c3), true);
		assertEquals(cs1.removeComputer(0), true);
		assertEquals(cs1.removeComputer(2), false);
	}
	
	@Test
	public void testFindExpensive() {
		Computer c1 = new Computer(10, 100, 1000);
		Computer c2 = new Computer(1000, 1000, 1000);
		Computer c3 = new Computer(1000, 100, 10);
		ComputerStore cs1 = new ComputerStore();
		cs1.addComputer(c1);
		cs1.addComputer(c2);
		cs1.addComputer(c3);
		assertEquals(cs1.findMostExpensiveComputerV1(),c2);
		assertEquals(cs1.findMostExpensiveComputerV2(),c2);
		assertEquals(cs1.findMostExpensiveComputerV3(),c2);
		assertEquals(cs1.findMostExpensiveComputerV4(),c2);
	}
}
