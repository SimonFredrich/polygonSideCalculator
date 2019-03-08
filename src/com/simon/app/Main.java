package com.simon.app;

public class Main {

    public static void main(String[] args) {
        int x = 0, y = 0;
        float pi = (float) Math.PI;

        

        int point1X = 3, point1Y = 2;
        int point2X = 2, point2Y = 4;

        int xAchse = point1X - point2X;
        int yAchse = point2Y - point1Y;

        var result = Math.sqrt((xAchse*xAchse) + (yAchse*yAchse));
        System.out.println(result);

    }
}
