package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String rawString = "Alice was beginning to get very tired of sitting by her sister" +
                " on the bank, and of having nothing to do: once or twice she" +
                " had peeped into the book her sister was reading, but it had no" +
                " pictures or conversations in it, 'and what is the use of a" +
                " book,' thought Alice 'without pictures or conversation?'";
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a term search ");
        String searchTerm = input.nextLine().toLowerCase();
        String lowerCaseString = rawString.toLowerCase();

//        String lowerCaseString = rawString.toLowerCase();
//        Boolean isFound = lowerCaseString.contains(searchTerm);
//        System.out.println(isFound);
//
//       }
        Integer index = lowerCaseString.indexOf(searchTerm);
        Integer length = searchTerm.length();
        System.out.println("Your term first appears at index " + index + ". Your term is " + length + " characters long");
        String modifiedString = lowerCaseString.replace(searchTerm, "");
        System.out.print(modifiedString);
    }
}