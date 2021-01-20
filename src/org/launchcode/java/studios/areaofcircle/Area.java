package org.launchcode.java.studios.areaofcircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
    double radius;
    double circleArea;
    Scanner input;

    input = new Scanner(System.in);
    System.out.println("Enter a radius: ");
    radius = input.nextDouble();
    circleArea = Circle.getArea(radius);
    input.close();

    System.out.println("The area of a circle of radius " + radius + " is: " + circleArea);

    }
}
