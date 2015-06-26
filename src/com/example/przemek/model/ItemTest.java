package com.example.przemek.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ItemTest {
	
	private Item itemOne;
	
	@Before
	public void setUp() {
		itemOne = new Item();
	}
	
	
	@Test
	public void valueZeroZeroTest() {
		itemOne.SetValue(0);
		itemOne.SetWeight(0);
		itemOne.makeValueRatio();
		assertTrue("item value ratio is not 0", itemOne.getValueRatio() == 0);
	}
	
	@Test
	public void valueNegativeTest() {
		itemOne.SetValue(-10);
		itemOne.SetWeight(-5);
		itemOne.makeValueRatio();
		assertTrue("item value ratio is not 2", itemOne.getValueRatio() == 2);
	}
	
	@Test
	public void valueStandardTest() {
		itemOne.SetValue(14);
		itemOne.SetWeight(3);
		itemOne.makeValueRatio();
		assertTrue("item value ratio is not 4", itemOne.getValueRatio() == 4);
	}
	

}
