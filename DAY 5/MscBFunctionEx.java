import java.util.Scanner;

public class MscBFunctionEx {
    static Scanner scan = new Scanner(System.in);

    static float c_wp_wr(int n1, int n2, char op) {
        float res = 0;
        switch (op) {
            case '+':
                res = n1 + n2;
                break;
            case '-':
                res = n1 - n2;
                break;
            case '*':
                res = n1 * n2;
                break;
            case '/':
                res = n1 / n2;
                break;
            default:
        }
        return res;
    }

    static void c_wp_nr(int n1, int n2, char op) {
    }

    static float c_np_wr() {
        return 0;
    }

    static void c_np_nr() {
    }

    public static void main(String[] args) {
        int n1, n2, choice;
        char op,option;

        do {
            System.out.println("WellCome To our Calculatornix");
            System.out.println("plese Select your options");
            System.out.println("Press 1 For Addition");
            System.out.println("Press 2 For Substraction");
            System.out.println("Press 3 For Multiplication");
            System.out.println("Press 4 For Division");
            choice = Integer.parseInt(scan.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Enter your 1st Number: ");
                    n1 = Integer.parseInt(scan.nextLine());
                    System.out.println("Enter your 2nd Number: ");
                    n2 = Integer.parseInt(scan.nextLine());
                    System.out.println("Enter your operator: ");
                    op = scan.nextLine().charAt(0);
                    float res = c_wp_wr(n1, n2, op);
                    System.out.println("result: " + res);
                    break;
                case 2:
                    c_wp_nr(n1, n2, op);
                    break;
                case 3:
                    c_np_wr();
                    break;
                case 4:
                    c_np_nr();
                    break;
                default:
                    System.out.println("Provide a valid input :)");
            }
            System.out.println("If you want to continue press (y)");
            option = scan.nextLine().charAt(0);
        } while (option.equalsIgnoreCase("y"));
    }
}