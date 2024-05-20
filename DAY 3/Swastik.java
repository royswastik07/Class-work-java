import java.util.Scanner;

class Calculator {
    
    public int add(int n1, int n2) {
        return n1 + n2;
    }
    
    public int sub(int n1, int n2) {
        return n1 - n2;
    }
    
    public int mul(int n1, int n2) {
        return n1 * n2;
    }
    
    public int div(int n1, int n2) {
        return n1 / n2;
    }
}

public class Swastik {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calc = new Calculator();
        char choice;

        do {
            System.out.println("what operation you want to do[+,-,*,/]: ");
            char operation = scan.nextLine().charAt(0);
            System.out.println("Enter First Number: ");
            int num1 = Integer.parseInt(scan.nextLine());
            System.out.println("Enter Second Number: ");
            int num2 = Integer.parseInt(scan.nextLine());

            switch (operation) {
                case '+':
                    int addition = calc.add(num1, num2);
                    System.out.println("The Addition: " + addition);
					break;
                case '-':
                    int subtraction = calc.sub(num1, num2);
                    System.out.println("The Subtraction: " + subtraction);
					break;
                case '*':
                    int multiplication = calc.mul(num1, num2);
                    System.out.println("The Multiplication: " + multiplication);
					break;
                case '/':
                    int division = calc.div(num1, num2);
                    System.out.println("The Division: " + division);
					break;
                default:
                    System.out.println("Give Valid Input");
            }

            System.out.println("Do you want to perform another operation? (Y/N)");
            choice = scan.nextLine().charAt(0);
        } while (choice == 'Y' || choice == 'y');

        scan.close();
    }
}
