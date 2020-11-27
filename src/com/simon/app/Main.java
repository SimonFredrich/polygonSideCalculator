package com.simon.app;

import com.simon.app.calculator.Calculator;
import com.simon.app.user.Input;

public class Main {

    public static void main(String[] args) {
        Input input = new Input();
        double r = input.radius();
        int side = input.side();

        Calculator calculator = new Calculator();
        System.out.print("Das Polygon hat eine Seitenlänge von: ");
        System.out.print(calculator.computeOneSideLengthOfPolygon(r, side));
    }

}
