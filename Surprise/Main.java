import java.util.Scanner;

import fun.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentDatabase database = new StudentDatabase();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Student");
            System.out.println("2. Search by Registration Number");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter registration number: ");
                    String regNo = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    database.addStudent(regNo, phoneNumber, name);
                    break;
                case 2:
                    System.out.print("Enter registration number to search: ");
                    String searchRegNo = scanner.nextLine();
                    database.searchByRegNo(searchRegNo);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close(); 
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 3.");
            }
        }
    }
}
