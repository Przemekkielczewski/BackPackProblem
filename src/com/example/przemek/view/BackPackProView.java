package com.example.przemek.view;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BackPackProView extends JFrame {

	private JLabel nameLabel;
	private JLabel valueLabel;
	private JLabel weightLabel;
	private JLabel amountLabel;

	private JTextField itemOneName;
	private JTextField itemOneValue;
	private JTextField itemOneWeight;
	private JTextField itemOneAmount;

	private JTextField itemTwoName;
	private JTextField itemTwoValue;
	private JTextField itemTwoWeight;
	private JTextField itemTwoAmount;

	private JTextField itemThreeName;
	private JTextField itemThreeValue;
	private JTextField itemThreeWeight;
	private JTextField itemThreeAmount;

	private JTextField itemFourName;
	private JTextField itemFourValue;
	private JTextField itemFourWeight;
	private JTextField itemFourAmount;

	private JTextField itemFiveName;
	private JTextField itemFiveValue;
	private JTextField itemFiveWeight;
	private JTextField itemFiveAmount;

	private JLabel instructions;
	private JButton packButton;

	private JTextField answerField;

	public BackPackProView() {

		this.setSize(600, 400);
		this.setTitle("BackPack Problem");
		this.setLayout(new GridLayout(2, 1));

		JPanel itemsPanel = new JPanel();
		JPanel resultPanel = new JPanel();

		nameLabel = new JLabel("Item Name");
		valueLabel = new JLabel("Value");
		weightLabel = new JLabel("Weight");
		amountLabel = new JLabel("Amount");

		itemOneName = new JTextField();
		itemOneValue = new JTextField();
		itemOneWeight = new JTextField();
		itemOneAmount = new JTextField();

		itemTwoName = new JTextField();
		itemTwoValue = new JTextField();
		itemTwoWeight = new JTextField();
		itemTwoAmount = new JTextField();

		itemThreeName = new JTextField();
		itemThreeValue = new JTextField();
		itemThreeWeight = new JTextField();
		itemThreeAmount = new JTextField();

		itemFourName = new JTextField();
		itemFourValue = new JTextField();
		itemFourWeight = new JTextField();
		itemFourAmount = new JTextField();

		itemFiveName = new JTextField();
		itemFiveValue = new JTextField();
		itemFiveWeight = new JTextField();
		itemFiveAmount = new JTextField();

		itemsPanel.setLayout(new GridLayout(6, 4));

		itemsPanel.add(nameLabel);
		itemsPanel.add(valueLabel);
		itemsPanel.add(weightLabel);
		itemsPanel.add(amountLabel);

		itemsPanel.add(itemOneName);
		itemsPanel.add(itemOneValue);
		itemsPanel.add(itemOneWeight);
		itemsPanel.add(itemOneAmount);

		itemsPanel.add(itemTwoName);
		itemsPanel.add(itemTwoValue);
		itemsPanel.add(itemTwoWeight);
		itemsPanel.add(itemTwoAmount);

		itemsPanel.add(itemThreeName);
		itemsPanel.add(itemThreeValue);
		itemsPanel.add(itemThreeWeight);
		itemsPanel.add(itemThreeAmount);

		itemsPanel.add(itemFourName);
		itemsPanel.add(itemFourValue);
		itemsPanel.add(itemFourWeight);
		itemsPanel.add(itemFourAmount);

		itemsPanel.add(itemFiveName);
		itemsPanel.add(itemFiveValue);
		itemsPanel.add(itemFiveWeight);
		itemsPanel.add(itemFiveAmount);

		this.add(itemsPanel);

		instructions = new JLabel(
				"Insert parameters of items you have and press button. "
				+ "You can pack as much as 15 points of weight");
		packButton = new JButton("What to pack?");
		answerField = new JTextField();

		resultPanel.setLayout(new GridLayout(3, 1));

		resultPanel.add(instructions);
		resultPanel.add(packButton);
		resultPanel.add(answerField);

		this.add(resultPanel);
	}

	public String getFirstName() {
		return itemOneName.getText();
	}

	public String getSecondName() {
		return itemTwoName.getText();
	}

	public String getThirdName() {
		return itemThreeName.getText();
	}

	public String getFourthName() {
		return itemFourName.getText();
	}

	public String getFifthName() {
		return itemFiveName.getText();
	}
	
	public int getFirstValue() {
		return Integer.parseInt(itemOneValue.getText());
	}
	
	public int getSecondValue() {
		return Integer.parseInt(itemTwoValue.getText());
	}
	
	public int getThirdValue() {
		return Integer.parseInt(itemThreeValue.getText());
	}
	
	public int getFourthValue() {
		return Integer.parseInt(itemFourValue.getText());
	}
	
	public int getFifthValue() {
		return Integer.parseInt(itemFiveValue.getText());
	}
	
	public int getFirstWeight() {
		return Integer.parseInt(itemOneWeight.getText());
	}
	
	public int getSecondWeight() {
		return Integer.parseInt(itemTwoWeight.getText());
	}
	
	public int getThirdWeight() {
		return Integer.parseInt(itemThreeWeight.getText());
	}
	
	public int getFourthWeight() {
		return Integer.parseInt(itemFourWeight.getText());
	}
	
	public int getFifthWeight() {
		return Integer.parseInt(itemFiveWeight.getText());
	}
	
	public int getFirstAmount() {
		return Integer.parseInt(itemOneAmount.getText());
	}
	
	public int getSecondAmount() {
		return Integer.parseInt(itemTwoAmount.getText());
	}
	
	public int getThirdAmount() {
		return Integer.parseInt(itemThreeAmount.getText());
	}
	
	public int getFourthAmount() {
		return Integer.parseInt(itemFourAmount.getText());
	}
	
	public int getFifthAmount() {
		return Integer.parseInt(itemFiveAmount.getText());
	}

	public void setAnswerText(String Answer){
		this.answerField.setText(Answer);
	}
	
	public void addPackListener(ActionListener actionListener) {
		this.packButton.addActionListener(actionListener);
	}
	
	public void DisplayError(String errorMessage) {
		JOptionPane.showMessageDialog(this, errorMessage);		
	}

}
