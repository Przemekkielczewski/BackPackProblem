package com.example.przemek.model;

import java.util.ArrayList;

public class GreedyApproach {

	public String GreedyMethod(ArrayList<Item> List, int maxWeight) {

		this.Sort(List, List.size());

		int weight = 0;
		int i = 0;
		while (i <= List.size()-1) {

			if (List.get(i).GetAmount() > 0
					&& weight + List.get(i).GetWeight() <= maxWeight) {
				List.get(i).increaseTaken();
				List.get(i).SetAmount(List.get(i).GetAmount()-1);
				weight = weight + List.get(i).GetWeight();
			} else {
				i = i + 1;
			}
		}
		return this.answer(List);//not really sure if it's good
	}

	public void Sort(ArrayList<Item> List, int ListSize) {

		for (int i = 0; i <= ListSize - 2; i++) {

			for (int j = 0; j <= ListSize - 2; j++) {
				Item helpItem = new Item();

				if (List.get(j).getValueRatio() < List.get(j + 1)
						.getValueRatio()) {
					helpItem = List.get(j + 1);
					List.set(j + 1, List.get(j));
					List.set(j, helpItem);
				}
			}
		}
	}

	public String answer(ArrayList<Item> List) {
		String answer = "you should pack: ";
		for (int i = 0; i <= List.size()-1; i++) {
			if (List.get(i).GetTaken() > 0 ) {
			answer = answer + List.get(i).GetName() + 
					" x " + List.get(i).GetTaken() + " ";	
			}	
		}
		return answer;
	}
}