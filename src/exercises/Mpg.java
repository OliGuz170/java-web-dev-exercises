package exercises;

import java.util.Scanner;

public class Mpg {
    public static void main(String[] args) {
        int miles;
        int gallons;
        float mpg;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("How many miles you have driven?: ");
        miles = input.nextInt();
        System.out.println("How many gallons of gas has your car consumed?: ");
        gallons = input.nextInt();
        input.close();

        mpg = miles/gallons;
        System.out.println("Your miles-per-gallon: " + mpg);
    }

}
