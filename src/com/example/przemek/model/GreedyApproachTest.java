package com.example.przemek.model;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class GreedyApproachTest {

	private GreedyApproach model = new GreedyApproach();
	private ArrayList<Item> List;
	private Item item1;
	private Item item2;
	private Item item3;
	private Item item4;
	private Item item5;
	
	
	public void setItem (Item item, String name, int weight, 
			int value, int amount) {
		item.SetName(name);
		item.SetWeight(weight);
		item.SetValue(value);
		item.SetAmount(amount);
		item.makeValueRatio();
	}
	
	@Before
	public void setUp () {
		List = new ArrayList<Item>();
		item1 = new Item();
		item2 = new Item();
		item3 = new Item();
		item4 = new Item();
		item5 = new Item();
		List.add(item1);
		List.add(item2);
		List.add(item3);
		List.add(item4);
		List.add(item5);	
	}
	
	@Test
	public void basicTest() {
		this.setItem(item1, "Ring", 1, 100, 2);
		this.setItem(item2, "Cape", 3, 60, 2);
		this.setItem(item3, "Sword", 6, 100, 1);
		this.setItem(item4, "Buckler", 4, 30, 3);
		this.setItem(item5, "Rags", 2, 10, 2);
		assertEquals ( "you should pack: Ring x 2 Cape x 2 Sword x 1 ", 
				model.GreedyMethod(List, 15));
		
	}
	
	@Test
	public void EmptyTest() {
		this.setItem(item1, "Ring", 1, 100, 0);
		this.setItem(item2, "Cape", 3, 60, 0);
		this.setItem(item3, "Sword", 6, 100, 0);
		this.setItem(item4, "Buckler", 4, 30, 0);
		this.setItem(item5, "Rags", 2, 10, 0);
		assertEquals ( "you should pack: ", 
				model.GreedyMethod(List, 15));
		
	}
	
	@Test
	public void SameTest() {
		this.setItem(item1, "Golden Ring", 1, 100, 2);
		this.setItem(item2, "Emerald Ring", 1, 100, 4);
		this.setItem(item3, "Ring", 1, 100, 6);
		this.setItem(item4, "Ring", 1, 100, 3);
		this.setItem(item5, "Rags", 2, 10, 2);
		assertEquals ( "you should pack: "
				+ "Golden Ring x 2 Emerald Ring x 4 Ring x 6 Ring x 3 ", 
				model.GreedyMethod(List, 15));
	}
	
	@Test
	public void NegativeTest() {
		this.setItem(item1, "Ring", 1, 100, 2);
		this.setItem(item2, "Cape", 3, 60, -2);
		this.setItem(item3, "Sword", 6, 100, 1);
		this.setItem(item4, "Buckler", 4, 30, -3);
		this.setItem(item5, "Rags", 2, 10, 2);
		assertEquals ( "you should pack: Ring x 2 Sword x 1 Rags x 2 ", 
				model.GreedyMethod(List, 15));
	}
	
	@Test
	public void BorderTest() {
		this.setItem(item1, "Mail", 12, 200, 2);
		this.setItem(item2, "Cape", 5, 60, 2);
		this.setItem(item3, "Sword", 7, 100, 1);
		this.setItem(item4, "Buckler", 5, 30, 3);
		this.setItem(item5, "Rags", 2, 10, 2);
		assertEquals ( "you should pack: Rags x 2 ", 
				model.GreedyMethod(List, 4));
	}
}
