package com.example.demo.rest;



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class View {
    JFrame frame = new JFrame ("calculator");
    JPanel textPanel = new JPanel();
    JPanel buttonPanel = new JPanel();
    JPanel buttonPanel2 = new JPanel();
    JLabel textLabel = new JLabel("");
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
        frame.setLayout(new GridLayout(3,1));
        frame.add(textPanel);
        frame.add(buttonPanel);
        frame.add(buttonPanel2);
        textPanel.add(textLabel);

        buttonPanel.setLayout(new GridLayout(2,4));
        buttonPanel2.setLayout(new GridLayout(2,4));
        buttonPanel.add(one);
        buttonPanel.add(two);
        buttonPanel.add(three);
        buttonPanel.add(plus);
        buttonPanel.add(four);
        buttonPanel.add(five);
        buttonPanel.add(six);
        buttonPanel.add(minus);
        buttonPanel2.add(seven);
        buttonPanel2.add(eight);
        buttonPanel2.add(nine);
        buttonPanel2.add(multiply);
        buttonPanel2.add(equals);
        buttonPanel2.add(zero);
        buttonPanel2.add(clear);
        buttonPanel2.add(divide);

        frame.setSize(600,600);
        frame.setVisible(true);

    }


}
