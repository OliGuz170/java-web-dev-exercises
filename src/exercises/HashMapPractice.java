package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Map<Integer, String> roster = new HashMap<>();

        String newStudent;

        System.out.println("Enter student name and ID numbers (or Enter to finish); ");

        do {
            System.out.println("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")){
            System.out.println("ID: ");
            Integer newId = input.nextInt();
            roster.put(newId, newStudent);
        }
            input.nextLine();
        }while(!newStudent.equals(""));
        input.close();
        System.out.println("Roster: ");

        for(Map.Entry<Integer, String> student: roster.entrySet()){
            System.out.println(student.getValue() + "'s ID: " + student.getKey());
        }
        System.out.println("Number of students: " + roster.size());
    }
}
