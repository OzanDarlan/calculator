package com.example.demo.rest;
import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        Model m = new Model();
        View v = new View();
        RestCalculator r = new RestCalculator(m);
        Controller c = new Controller(m, v, r);
    }
}
