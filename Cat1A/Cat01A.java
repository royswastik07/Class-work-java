import java.util.Scanner;
import java.io.File;
import java.io.IOException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Cat01A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            File file = new File("input.txt");
            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNextLine()) {
                String data = fileScanner.nextLine();
                System.out.println(data);
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }

        System.out.println("\nEnter student name to search:");
        String searchName = input.nextLine();

        try {
            File file = new File("input.txt");
            Scanner fileScanner = new Scanner(file);
            boolean found = false;
            while (fileScanner.hasNextLine()) {
                String data = fileScanner.nextLine();
                String[] studentDetails = data.split(", ");
                if (studentDetails[0].equalsIgnoreCase(searchName)) {
                    System.out.println("Student found!");
                    System.out.println("Name: " + studentDetails[0]);
                    System.out.println("ID: " + studentDetails[1]);
                    System.out.println("Email: " + studentDetails[2]);
                    System.out.println("Program: " + studentDetails[3]);
                    System.out.println("Year: " + studentDetails[4]);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Student not found.");
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}

