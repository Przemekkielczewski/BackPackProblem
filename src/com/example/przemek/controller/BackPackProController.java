package com.example.przemek.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import com.example.przemek.model.GreedyApproach;
import com.example.przemek.model.Item;
import com.example.przemek.view.BackPackProView;

public class BackPackProController {

	GreedyApproach greedyModel;
	BackPackProView backPackProView;

	public BackPackProController(GreedyApproach model, BackPackProView view) {

		this.greedyModel = model;
		this.backPackProView = view;

		this.backPackProView.addPackListener(new listenerForPack());
	}

	class listenerForPack implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				Item item1 = new Item();
				Item item2 = new Item();
				Item item3 = new Item();
				Item item4 = new Item();
				Item item5 = new Item();

				item1.SetName(backPackProView.getFirstName());
				item1.SetValue(backPackProView.getFirstValue());
				item1.SetWeight(backPackProView.getFirstWeight());
				item1.SetAmount(backPackProView.getFirstAmount());
				item1.makeValueRatio();

				item2.SetName(backPackProView.getSecondName());
				item2.SetValue(backPackProView.getSecondValue());
				item2.SetWeight(backPackProView.getSecondWeight());
				item2.SetAmount(backPackProView.getSecondAmount());
				item2.makeValueRatio();

				item3.SetName(backPackProView.getThirdName());
				item3.SetValue(backPackProView.getThirdValue());
				item3.SetWeight(backPackProView.getThirdWeight());
				item3.SetAmount(backPackProView.getThirdAmount());
				item3.makeValueRatio();

				item4.SetName(backPackProView.getFourthName());
				item4.SetValue(backPackProView.getFourthValue());
				item4.SetWeight(backPackProView.getFourthWeight());
				item4.SetAmount(backPackProView.getFourthAmount());
				item4.makeValueRatio();

				item5.SetName(backPackProView.getFifthName());
				item5.SetValue(backPackProView.getFifthValue());
				item5.SetWeight(backPackProView.getFifthWeight());
				item5.SetAmount(backPackProView.getFifthAmount());
				item5.makeValueRatio();

				ArrayList<Item> itemsList = new ArrayList();

				itemsList.add(item1);
				itemsList.add(item2);
				itemsList.add(item3);
				itemsList.add(item4);
				itemsList.add(item5);

				backPackProView.setAnswerText(greedyModel.GreedyMethod(
						itemsList, 15));
			} 
			catch (NumberFormatException ex) {
				backPackProView
						.DisplayError("all spaces must be filled, name with text, others with numbers");
				return;
			}
		}
	}
}
