package exercises;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int[] practiceArray = {1, 1, 2, 3, 5, 8};

//for each loop to print out each value in the array
//        for (int i : practiceArray) {
//            System.out.println(i);

        //}
        String seus = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = seus.split(" ");
        for(String word : words) {
            System.out.println(word);
        }

        String[] lines = seus.split("\\.");
        for(String line: lines){
            System.out.println(line);
        }
    }
}
