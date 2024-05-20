/*
 * ***************************************************************************
 * Name: Swastik Roy
 * Register Number: 23122136
 * Class: 3MScDS B
 * Date : 06-04-2024
 * ***************************************************************************
 *                     Student Record Management
 * This java program is done arround the domain of student data management in
 * an accademic setting. 
 * 
 * The main aim of the program is to understand the working of
 * 1. Classes
 * 2. Data Members / Attributes of a Class
 * 3. Member functions
 * 4. Constructors
 * 5. Objects
 * 6. Introduction to access modifiers, array of objects | object array
 * 
 */

 import java.util.Scanner;

 class Student{
     private String name;
     private long reg_no;
     private String email;
     private String dob;
     private int age;
     private String[][] marks;
     private int subjectCounter;
 
     Student(){
         /*
          * Task 1: Fill the code to initilize the variables with some default values for the attributes [Name, reg_no, email, dob and age].
          * Note: in the program you will be using DD-MM-YYYY format to store the date.
          * Note: age should not be taken as an user input
          * Task 2: For the marks attribute, you will use a string array with the 2-dimention,
          * for each of the subject, you will store these details {"Subject Name","Semester","Max Mark","Secured Mark"}. 
          * Hence here you will initialize the marks array that helps to store maximum of 10 Marks for a student.
          */
            this.name = "";
            this.reg_no = 0;
            this.email = "";
            this.dob = "";
            this.age = 0;
            this.marks = new String[2][4];
            this.subjectCounter = 0;
 
         this.subjectCounter = 0;
     }
 
     Student(String name, long reg_no, String email, String dob){
         this.name = name;
         this.reg_no = reg_no;
         this.email = email;
         this.dob = dob;
         /*
          * Task 1: Calculate the age with the help of the computeAge() and store in the age attribute
          * Task 2: use the same logic for the marks attribute initialization
          */
 
         this.subjectCounter = 0;
     }
 
     private int computeAge(String dob){
         int age = 0;
         /*
          * Task 1: Complete the logic to identify the age from the date of birth from the format DD-MM-YYYY
          */
 
         return age;
     }
 
     public void addMarks(String[] mark){
         /*
          * Task: add the mark for the subject to the marks array by incrementing the subjectCounter
          */
 
     }
 
     public void printStudentDetails(){
         /*
          * Task: print the student details based on all the available data
          */
        System.out.println("Name: " + name);
        System.out.println("Registration Number: " + reg_no);
        System.out.println("Email: " + email);
        System.out.println("Date of Birth: " + dob);
        System.out.println("Age: " + age);
        System.out.println("Marks:");
        // for (int i = 0; i < subjectCounter; i++) {
        //     System.out.println("Subject: " + marks[i][0]);
        //     System.out.println("Semester: " + marks[i][1]);
        //     System.out.println("Max Mark: " + marks[i][2]);
        //     System.out.println("Secured Mark: " + marks[i][3]);
        // }
 
     }
     
     public String getName(){
         return this.name;
     }
 
     public String toString(){
         /*
          * Modify this method to return all the values in the variable in coma seperated from.
          */
 
          return name + ", " + reg_no + ", " + email + ", " + dob + ", " + age;
     }
  }
 
  public class Lab03{
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
 
         Student[] mscds = new Student[82];
         int studentCounter = 0;
 
         /*
          * Execute the following chuck of code for some hint !
          * 
          * mscds[studentCounter] = new Student();
          * System.out.println(mscds[studentCounter].getName());
          * studentCounter+= 1;
          * mscds[studentCounter] = new Student("Alwin Joseph",1847207,"alwin.joseph@christuniversity.in","06-04-2000");
          * System.out.println(mscds[studentCounter].getName());
          * studentCounter+= 1;
          * 
          */
 
         /*
          * TODO: write an appropriate menu dirven program that helps me to manage the data of students of MSc Ds at CHRIST University.
          * 
          * Working of the menu driven program:
          * ----------------------------------------
          * The menu will have the following options:
          * 1. Add the details of student.
          * 2. View the detail of a students
          * 3. Search the detail of a stuent
          * 4. Exit
          * 
          * Note: Adding the Marks for a student can be kept as an optional feature after adding the basic details and searching for a student
          * 
          */
          while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add the details of student.");
            System.out.println("2. View the detail of a students");
            System.out.println("3. Search the detail of a stuent");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    // Add student details
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter registration number: ");
                    long reg_no = Long.parseLong(scanner.nextLine());
                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();
                    System.out.print("Enter date of birth (DD-MM-YYYY): ");
                    String dob = scanner.nextLine();
                    mscds[studentCounter] = new Student(name, reg_no, email, dob);
                    studentCounter++;
                    break;
                case 2:
                    // View student details
                    System.out.print("Enter student name to view details: ");
                    String studentName = scanner.nextLine();
                    boolean found = false;
                    for (int i = 0; i < studentCounter; i++) {
                        if (mscds[i].getName().equalsIgnoreCase(studentName)) {
                            mscds[i].printStudentDetails();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Student not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter student name to search: ");
                    String searchName = scanner.nextLine();
                    boolean studentFound = false;
                    for (int i = 0; i < studentCounter; i++) {
                        Student currentStudent = mscds[i];
                        if (currentStudent.getName().equalsIgnoreCase(searchName)) {
                            System.out.println("Student found:");
                            currentStudent.printStudentDetails();
                            studentFound = true;
                            break;
                        }
                    }
                    if (!studentFound) {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    scanner.close(); // Close the scanner to prevent resource leak
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}