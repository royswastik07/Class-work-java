// // Todays Task

// // Write a JAVA Program to manage the attendance of students.

// // Task 1: Identify the requirements; Plan the various data-members, classes and functions.

// // Task 2: Code !

import java.util.ArrayList;
import java.io.*;
import java.util.*;


class Student{
    private String name;    // Initializing private data members 
    private int rollNumber;
    private boolean isPresent;

    // Consturctor of teh class 
    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.isPresent = false; 
    }
    
    // Creating Getter & Setter method to access the private DATA MEMBERS from outside the class 

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public boolean isPresent() {
        return isPresent;
    }

    public void setPresent(boolean present) {
        isPresent = present;
    }
}

public class SaM {
    private ArrayList<Student> students;

    public SaM() {
        this.students = new ArrayList<>();
    }

    // Method to read student details from a text file
    // Method to read student details from a text file
    public void readStudentDetailsFromFile(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            // Skip the header line
            br.readLine();
            // Read student details
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\\s+");
                String name = parts[0];
                int rollNumber = Integer.parseInt(parts[1]);
                addStudent(name, rollNumber);
            }
        } catch (IOException e) {
            System.err.println("Error reading student details from file: " + e.getMessage());
        }
    }

    // Method to add a student
    public void addStudent(String name, int rollNumber) {
        Student student = new Student(name, rollNumber);
        students.add(student);
    }

    // Method to mark attendance for students
    public void markAttendance() {
        Scanner scanner = new Scanner(System.in);
        for (Student student : students) {
            System.out.println("Is " + student.getName() + " present? (yes/no):");
            String response = scanner.nextLine().trim().toLowerCase();
            if (response.equals("yes")) {
                student.setPresent(true);
            } else if (response.equals("no")) {
                student.setPresent(false);
            } else {
                System.out.println("Invalid response. Please enter 'yes' or 'no'.");
            }
        }
        scanner.close();
    }

    // Method to write attendance details to a text file
    // Method to write attendance details to a text file
    public void writeAttendanceToFile(String fileName) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName, true))) {
            for (Student student : students) {
                writer.println(student.getRollNumber() + "," + (student.isPresent() ? "Present" : "Absent"));
            }
            System.out.println("Attendance details written to file: " + fileName);
        } catch (IOException e) {
            System.err.println("Error writing attendance details to file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        SaM attendanceManager = new SaM();

        // Read student details from file
        attendanceManager.readStudentDetailsFromFile("StDetails.txt");

        // Mark attendance for students
        attendanceManager.markAttendance();

        // Write attendance details to file
        attendanceManager.writeAttendanceToFile("StAttDetails.txt");
    }
}
