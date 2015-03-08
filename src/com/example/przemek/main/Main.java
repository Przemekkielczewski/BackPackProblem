package com.example.przemek.main;

import javax.swing.JFrame;

import com.example.przemek.controller.BackPackProController;
import com.example.przemek.model.GreedyApproach;
import com.example.przemek.view.BackPackProView;

public class Main {

	public static void main(String[] args) {
		
		BackPackProView mainFrame = new BackPackProView();
		GreedyApproach mainModel = new GreedyApproach();
		
		BackPackProController Controller = new BackPackProController(mainModel, mainFrame);
		
		mainFrame.setVisible(true);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
