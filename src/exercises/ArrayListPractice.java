package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> someIntegers = new ArrayList(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(sumEven(someIntegers));

        Scanner input = new Scanner(System.in);
        System.out.println("How many characters should I search for?");
        int wordlength = input.nextInt();
        ArrayList<String> words = new ArrayList<String>();
        words.add("cake");
        words.add("cupcake");
        words.add("cookie");
        words.add("pie");
        words.add("donut");
        printWords(words, wordlength);
    }
    public static void printWords(ArrayList<String> words, int length){
        for(String word: words){
            if(word.length() == length) {
                System.out.println(word);
            }
        }
    }

    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for(int integer: arr) {
            if(integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }
}
