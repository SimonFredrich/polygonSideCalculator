package com.simon.app.user;

import com.simon.app.calculator.Calculator;

import java.util.Scanner;

public class Input {

    private Scanner s = new Scanner(System.in);

    public Input() {
        int side = side();
        double r = radius();

        Calculator calculator = new Calculator();
        System.out.println(calculator.computeOneSideLengthOfPolygon(r, side));
    }

    private double radius() {
        System.out.println("Give me the radius: ");
        return s.nextDouble();
    }

    private int side() {
        System.out.println("Give me the sides: ");
        return s.nextInt();
    }
}
