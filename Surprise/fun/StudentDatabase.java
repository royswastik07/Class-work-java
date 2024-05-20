package fun;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentDatabase {
    private Map<String, Student> students;
    private static final String FILENAME = "students.txt";

    public StudentDatabase() {
        this.students = new HashMap<>();
        loadDatabase();
    }

    public void addStudent(String regNo, String phoneNumber, String name) {
        students.put(regNo, new Student(regNo, phoneNumber, name));
        saveDatabase();
        System.out.println("Student added successfully.");
    }

    public void searchByRegNo(String regNo) {
        Student student = students.get(regNo);
        if (student != null) {
            System.out.println("Student found:");
            System.out.println(student);
        } else {
            System.out.println("Student with registration number " + regNo + " not found.");
        }
    }

    private void loadDatabase() {
        try {
            File file = new File(FILENAME);
            if (!file.exists()) {
                file.createNewFile();
                return;
            }

            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String[] parts = scanner.nextLine().split(",");
                if (parts.length == 3) {
                    students.put(parts[0], new Student(parts[0], parts[1], parts[2]));
                }
            }
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void saveDatabase() {
        try {
            FileWriter writer = new FileWriter(FILENAME);
            for (Student student : students.values()) {
                writer.write(student.getRegNo() + "," + student.getPhoneNumber() + "," + student.getName() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
