package com.example.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;

import java.awt.event.*;

import org.springframework.web.client.RestTemplate;
import org.springframework.web.client.RestTemplate.*;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JOptionPane;
public class Controller implements ActionListener {
    private Model model;
    private View view;
    private RestCalculator restCalculator;
    private RestTemplate restTemplate;
    private String URL = "http://localhost:8080/api";
    private String lastResult;
    public Controller (Model model, View view, RestCalculator restCalculator) {
        this.model = model;
        this.view = view;
        this.restCalculator = restCalculator;
        restTemplate = new RestTemplate();
        listenButtons();
    }

    public void actionPerformed (ActionEvent e) {
        //NUMBER
        String buttonText = ((JButton)e.getSource()).getText();
        if (isNumeric(buttonText)) {
            String currentText = view.textLabel.getText();
            view.textLabel.setText(currentText + buttonText);
        }
        //SIGN
        else if (isSign(buttonText)) {
            String currentText = view.textLabel.getText();
            int p = Integer.parseInt(currentText);


            //model.setOperation(buttonText);
            if(buttonText.equals("+"))
                URL += "/add";
            else if (buttonText.equals("-"))
                URL += "/sub";
            else if (buttonText.equals("*"))
                URL += "/mul";
            else if (buttonText.equals("/"))
                URL += "/div";

            //model.setP1(p);
            URL += "/" + p;

            view.textLabel.setText("");
        }
        //RESULT
        else if (e.getSource().equals(view.equals)) {
            String currentText = view.textLabel.getText();
            int p2 = Integer.parseInt(currentText);
            //model.setP2(p2);
            URL += "/" + p2;

            String result = "";
            try {
                //result = "" + model.getResult();
                result = "" + restTemplate.getForObject(URL, Integer.class);
            } catch (Exception ex) {
                view.textLabel.setText("");
                //model.setP1(0);
                //model.setP2(0);
                //model.setOperation("");
                JOptionPane.showMessageDialog(view.frame, "cant devide by zero");
                result = "0";
            }
            view.textLabel.setText(result);
            //model.setP1(Integer.parseInt(result));
            lastResult = result;
            URL = "http://localhost:8080/api";
        }
        //CLEAR
        else if (e.getSource().equals(view.clear)) {
            view.textLabel.setText("");
            URL = "http://localhost:8080/api";
            //model.setP1(0);
            //model.setP2(0);
            //model.setOperation("");
        }
    }

    public boolean isNumeric(String strNum) {
        try {
            int d = Integer.parseInt(strNum);
        } catch (NumberFormatException | NullPointerException nfe) {
            return false;
        }
        return true;
    }

    public boolean isSign (String buttonText) {
        if (buttonText.equals("+") || buttonText.equals("-") || buttonText.equals("*") || buttonText.equals("/"))
            return true;
        else
            return false;
    }

    public void listenButtons () {
        view.one.addActionListener(this);
        view.two.addActionListener(this);
        view.three.addActionListener(this);
        view.four.addActionListener(this);
        view.five.addActionListener(this);
        view.six.addActionListener(this);
        view.seven.addActionListener(this);
        view.eight.addActionListener(this);
        view.nine.addActionListener(this);
        view.zero.addActionListener(this);
        view.plus.addActionListener(this);
        view.minus.addActionListener(this);
        view.multiply.addActionListener(this);
        view.divide.addActionListener(this);
        view.clear.addActionListener(this);
        view.equals.addActionListener(this);
    }

    public Model getModel () {
        return model;
    }

}
