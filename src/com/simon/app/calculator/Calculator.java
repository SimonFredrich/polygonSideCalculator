package com.simon.app.calculator;

public class Calculator {

    public double computeOneSideLengthOfPolygon(double r, int sides) {
        return 2*r*Math.sin(Math.PI/sides);
    }

}
