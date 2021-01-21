package studios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args){
        String searchString = "";

        try{
            File myObj = new File("./src/studios/test.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()){
                String data = myReader.nextLine();
                searchString += data;
            }
            myReader.close();
        }catch(FileNotFoundException ex){
            System.out.println(ex);
            System.out.println("Testing123");
        }
        searchString = searchString.toLowerCase();
        System.out.println(searchString);

        char[] lettersArray = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        Map<Character, Integer> characterCounts = new HashMap<Character, Integer>();
//        List<Character> list = Arrays.asList(lettersArray);

        for(char character: searchString.toCharArray()){
            System.out.println(character);

            if(!Character.isLetter(character)){
                continue;
            }

            if(!characterCounts.containsKey(character)){
                characterCounts.put(character, 1);
            }else{
                characterCounts.put(character, characterCounts.get(character) + 1);
            }
        }
        for(Map.Entry<Character, Integer> entry: characterCounts.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
