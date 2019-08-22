package com.example.demo.rest;

import org.springframework.stereotype.Component;

@Component
public class Model {
    //a function interface
    private int parameter1 = 0;
    private int parameter2 = 0;
    private String operation = "";
    private boolean initialState = true;



    interface Calculation {
        int operation(int a, int b);
    }

    public int operate (int a, int b, Calculation calculation ) {
        return calculation.operation(a, b);
    }

    Calculation addition = (int x, int y) -> x + y;
    Calculation substraction = (int x, int y) -> x - y;
    Calculation multiplication = (int x, int y) -> x * y;
    Calculation division = (int x, int y) -> x / y;

    public int getP1 () {
        return parameter1;
    }

    public int getP2 () {
        return parameter2;
    }

    public void setP1 (int p1) {
        parameter1 = p1;
    }

    public void setP2 (int p2) {
        parameter2 = p2;
    }

    public void setOperation (String op) {
        operation = op;
    }

    public boolean isInitial () {
        return initialState;
    }

    public boolean getState () {
        return initialState;
    }

    public void setState (boolean state) {
        initialState = state;
        if (state)
            operation = "";
    }

    public int getResult () {

        if (operation.equals("+"))
            return operate(parameter1, parameter2, addition);
        else if (operation.equals("-"))
            return operate(parameter1, parameter2, substraction);
        else if (operation.equals("*"))
            return operate(parameter1, parameter2, multiplication);
        else if (operation.equals("/"))
            return operate(parameter1, parameter2, division);
        else
            return 0;



    }


}
