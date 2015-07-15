package com.example.przemek.model;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class GreedySortTest {

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
	public void sortingTypicalTest() {
		this.setItem(item1, "Cape", 2, 60, 1);
		this.setItem(item2, "Buckler", 2, 30, 3);
		this.setItem(item3, "Ring", 1, 100, 2);
		this.setItem(item4, "Rags", 2, 10, 2);
		this.setItem(item5, "Sword", 4, 100, 1);
		model.Sort(List, List.size());
		assertTrue (List.get(0).GetName() == "Ring");
		assertTrue (List.get(1).GetName() == "Cape");
		assertTrue (List.get(2).GetName() == "Sword");
		assertTrue (List.get(3).GetName() == "Buckler");
		assertTrue (List.get(4).GetName() == "Rags");
	}
	
	
	@Test
	public void sortingBorderTest() {
		this.setItem(item1, "Rags", 2, 10, 2);
		this.setItem(item2, "Buckler", 2, 30, 3);
		this.setItem(item3, "Sword", 4, 100, 1);
		this.setItem(item4, "Cape", 2, 60, 1);
		this.setItem(item5, "Ring", 1, 100, 2);
		model.Sort(List, List.size());
		assertTrue (List.get(0).GetName() == "Ring");
		assertTrue (List.get(1).GetName() == "Cape");
		assertTrue (List.get(2).GetName() == "Sword");
		assertTrue (List.get(3).GetName() == "Buckler");
		assertTrue (List.get(4).GetName() == "Rags");
	}
	
	@Test
	public void sortingCorrectTest() {
		this.setItem(item1, "Ring", 1, 100, 2);
		this.setItem(item2, "Cape", 2, 60, 1);
		this.setItem(item3, "Sword", 4, 100, 1);
		this.setItem(item4, "Buckler", 2, 30, 3);
		this.setItem(item5, "Rags", 2, 10, 2);
		model.Sort(List, List.size());
		assertTrue (List.get(0).GetName() == "Ring");
		assertTrue (List.get(1).GetName() == "Cape");
		assertTrue (List.get(2).GetName() == "Sword");
		assertTrue (List.get(3).GetName() == "Buckler");
		assertTrue (List.get(4).GetName() == "Rags");
	}

	@Test
	public void sortingSameTest() {
		this.setItem(item1, "Rags", 2, 10, 2);
		this.setItem(item2, "Cape", 2, 60, 1);
		this.setItem(item3, "Cape", 2, 60, 1);
		this.setItem(item4, "Cape", 2, 60, 1);
		this.setItem(item5, "Ring", 1, 100, 2);
		model.Sort(List, List.size());
		assertTrue (List.get(0).GetName() == "Ring");
		assertTrue (List.get(1).GetName() == "Cape");
		assertTrue (List.get(2).GetName() == "Cape");
		assertTrue (List.get(3).GetName() == "Cape");
		assertTrue (List.get(4).GetName() == "Rags");
	}
	
	@Test
	public void sortingSameyTest() {
		this.setItem(item1, "Rags", 2, 10, 2);
		this.setItem(item2, "Linen Cape", 2, 60, 1);
		this.setItem(item3, "Silk Cape", 2, 60, 1);
		this.setItem(item4, "Sacred Cape", 2, 60, 1);
		this.setItem(item5, "Ring", 1, 100, 2);
		model.Sort(List, List.size());
		assertTrue (List.get(0).GetName() == "Ring");
		assertTrue (List.get(1).GetName() == "Linen Cape");
		assertTrue (List.get(2).GetName() == "Silk Cape");
		assertTrue (List.get(3).GetName() == "Sacred Cape");
		assertTrue (List.get(4).GetName() == "Rags");
	}
	
	
	@Test
	public void sortingZeroTest() {
		this.setItem(item1, "Torn Cape", 2, 0, 1);
		this.setItem(item2, "Broken Buckler", 2, 0, 3);
		this.setItem(item3, "Small Ring", 0, 20, 2);
		this.setItem(item4, "Rags", 2, 0, 2);
		this.setItem(item5, "Holy Water", 0, 15, 1);
		model.Sort(List, List.size());
		assertTrue (List.get(0).GetName() == "Small Ring");
		assertTrue (List.get(1).GetName() == "Holy Water");
		assertTrue (List.get(2).GetName() == "Torn Cape");
		assertTrue (List.get(3).GetName() == "Broken Buckler");
		assertTrue (List.get(4).GetName() == "Rags");
	}
	
	@Test
	public void sortingNegativeTest() {
		this.setItem(item1, "Cape", 2, -60, 1);
		this.setItem(item2, "Buckler", 2, -30, 3);
		this.setItem(item3, "Ring", 1, -100, 2);
		this.setItem(item4, "Rags", 2, -10, 2);
		this.setItem(item5, "Sword", 4, -100, 1);
		model.Sort(List, List.size());
		assertTrue (List.get(0).GetName() == "Rags");
		assertTrue (List.get(1).GetName() == "Buckler");
		assertTrue (List.get(2).GetName() == "Sword");
		assertTrue (List.get(3).GetName() == "Cape");
		assertTrue (List.get(4).GetName() == "Ring");
	}
}
