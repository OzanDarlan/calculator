package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class View {
	JFrame frame = new JFrame ("calculator");
	JPanel textPanel = new JPanel();
	JPanel buttonPanel = new JPanel();
	JLabel textLabel = new JLabel("0");
	JButton one = new JButton("1");
	JButton two = new JButton("2");
	JButton three = new JButton("3");
	JButton four = new JButton("4");
	JButton five = new JButton("5");
	JButton six = new JButton("6");
	JButton seven = new JButton("7");
	JButton eight = new JButton("8");
	JButton nine = new JButton("9");
	JButton zero = new JButton("0");
	JButton plus = new JButton("+");
	JButton minus = new JButton("-");
	JButton multiply = new JButton("*");
	JButton divide = new JButton("/");
	JButton equals = new JButton("=");
	JButton clear = new JButton("C");
	
	public View() {
		frame.setLayout(new GridLayout(2,1));		
		frame.add(textPanel);
		frame.add(buttonPanel);
		
	    textPanel.add(textLabel);
	    
	    buttonPanel.setLayout(new GridLayout(4,4));
		buttonPanel.add(one);
		buttonPanel.add(two);
		buttonPanel.add(three);
		buttonPanel.add(plus);
		buttonPanel.add(four);
		buttonPanel.add(five);
		buttonPanel.add(six);
		buttonPanel.add(minus);
		buttonPanel.add(seven);
		buttonPanel.add(eight);
		buttonPanel.add(nine);
		buttonPanel.add(multiply);
		buttonPanel.add(equals);
		buttonPanel.add(zero);
		buttonPanel.add(clear);
		buttonPanel.add(divide);
		
		frame.setSize(600,600);  
		frame.setVisible(true);
		
	}
	
	
}
