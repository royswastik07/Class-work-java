import java.util.Scanner;

class student {
    public static void main(String[] args) {
        System.out.println("Welcome To My Enter Student Details Program");
        Scanner scan = new Scanner(System.in);
        
        int n;
        boolean validInput = false;
        
        do {
            System.out.println("Enter how many records you want to input: ");
            n = Integer.parseInt(scan.nextLine());
            
            switch (n) {
                case 1:
                case 2:
                case 3:
                    validInput = true;
                    break;
                default:
                    System.out.println("You entered a value outside the range (1 to 3). Please try again.");
                    break;
            }
        } while (!validInput);
        
        int i;
        for (i = 1; i <= n; i++) {
            System.out.println("Enter your name");
            String name = scan.nextLine();
    
            System.out.println("Enter your Age");
            int age = Integer.parseInt(scan.nextLine());
    
            System.out.println("Enter your Class");
            String classs = scan.nextLine();
    
            System.out.println("Enter your reg_no");
            long reg_no = Long.parseLong(scan.nextLine());
    
            System.out.println("Your Name: " + name);
            System.out.println("Your Age: " + age);
            System.out.println("Your Class: " + classs);
            System.out.println("Your Reg no: " + reg_no);
            System.out.println(i + " Record successfully stored");
        }
        
        scan.close();
    }
}
