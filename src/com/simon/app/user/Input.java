package com.simon.app.user;

import com.simon.app.calculator.Calculator;

import java.util.Scanner;

public class Input {

    private Scanner s = new Scanner(System.in);

    public double radius() {
        System.out.print("Give me the radius: ");
        return s.nextDouble();
    }

    public int side() {
        System.out.print("Give me the sides: ");
        return s.nextInt();
    }
}
