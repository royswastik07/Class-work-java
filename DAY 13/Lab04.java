import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class Employee {
    public String name;
    public String gender;
    public double income;

    Employee() {
    }

    Employee(String name, String gender, double income) {
        this.name = name.toLowerCase(); 
        this.gender = gender.toLowerCase(); 
        this.income = income;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName.toLowerCase(); 
    }

    double tax_calculation() {
        if (gender.equals("male")) { 
            return income * 0.10;
        } else {
            return income * 0.08;
        }

    }

    public String employee_details() {
        return this.name + " " + this.gender + " " + this.income;
    }

    public String tax_details() {
        return this.name + " " + tax_calculation();
    }

}

public class Lab04 {

    static void tax_management() {
        System.out.println("TAX MANAGEMENT PROGRAMME");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        tax_management();

        Employee myEmployee = new Employee();
        FileWriter employeeFileWriter = null;
        FileWriter taxFileWriter = null;

        try {
            employeeFileWriter = new FileWriter("Employees.txt", true);
            taxFileWriter = new FileWriter("EmployeeTax.txt", true);
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        do {
            System.out.println("-------------------");
            System.out.println("Enter Your Options: ");
            System.out.println("--------------------");
            System.out.println("1 Enter Emp Details ");
            System.out.println("2 See Emp Details ");
            System.out.println("3 View Tax for Employees ");
            System.out.println("4 For Exit");
            System.out.print("Enter your choice: ");

            choice = Integer.parseInt(input.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    myEmployee.name = input.nextLine().toLowerCase(); 
                    System.out.print("Enter gender(Male/Female): ");
                    myEmployee.gender = input.nextLine().toLowerCase(); 
                    System.out.print("Enter income: ");
                    myEmployee.income = Double.parseDouble(input.nextLine());

                    try {
                        employeeFileWriter.write(myEmployee.employee_details() + "\n");
                        taxFileWriter.write(myEmployee.tax_details() + "\n");
                        // employeeFileWriter.close();
                        // taxFileWriter.close();
                    } catch (IOException e) {
                        System.out.println("An error occurred");
                        e.printStackTrace();
                    }

                    break;
                case 2:
                    try {
                        File myObj = new File("Employees.txt");
                        Scanner myReader = new Scanner(myObj);
                        while (myReader.hasNextLine()) {
                            String data = myReader.nextLine();
                            System.out.println(data);
                        }
                        myReader.close();
                    } catch (IOException e) {
                        System.out.println("An error occurred.");
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    try {
                        File myObj = new File("EmployeeTax.txt");
                        Scanner myReader = new Scanner(myObj);
                        while (myReader.hasNextLine()) {
                            String data = myReader.nextLine();
                            String[] parts = data.split(" ");
                            System.out.println("Employee: " + parts[0] + ", Tax: " + parts[1]);
                        }
                        myReader.close();
                    } catch (IOException e) {
                        System.out.println("An error occurred.");
                        e.printStackTrace();
                    }
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        } while (choice != 4);

        input.close();
    }
}
