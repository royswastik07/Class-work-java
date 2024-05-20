/*
 * ***************************************************************************
 * Name: Swastik Roy
 * Register Number: 23122136
 * Class: MScDs2
 * Date : 04/04/2024
 * ***************************************************************************
 *                     Resturant Billing Application
 * You are going to create a JAVA program that runs in comand line for a Cafe.
 * That is aimed to track the billing of vairous items that has been sold for a
 * particular day.
 * 
 */

import java.util.*; 

class Restaurant {
    /*
     * Define the data member to store the menu items and its price (Eg.
     * Idli-Sambar - 30, Tea - 10)
     * Use a String array to store the menu item and its price.
     * String[][] menu = {{"Idli-Sambar","30"},{"Tea","10"}}
     */
    String[][] menu = { { "Idli", "30" }, { "Tea", "10" }, { "Poha", "10" }, { "Upma", "10" } };
    int order_count = 0;
    int total_cost = 0;
    int[] total_order = new int[1000];

    void printMenu() {
        /*
         * Code to print the restaurant menu in appropriate format
         */
        // Through looping Print the Menu
        System.out.println("Menu:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + " " + menu[i][0] + " Rs " + menu[i][1] + " /-");
        }
        System.out.println();
    }

    float computeAmount(int[] itemsSelected) {
        float amount = 0.0f;
        /*
         * itemsSelected is an array of indexes of menu array that stores the item name
         * and price you need to take out the price from the menu array, convert it to
         * integer / float and calculate the total price for the order
         */
        // Accessing the price from the menu array
        for (int index : itemsSelected) {
            float price = Float.parseFloat(menu[index][1]);
            amount += price;
        }
        return amount;
    }

    void generateBill(Scanner scanner) {
        /*
         * Call the printMenu function and print the menu options to the user. The
         * user will enter one or more choices that he wishes to order, you will
         * collect and store it in an integer array. This array will be passed to
         * computeAmount function to get the final bill for the order. Once the amount
         * is received, you will print the amount and the order gets processed! before
         * exiting the function, you need to store the items ordered into the 'orders'
         * array that tracks all the orders in your restaurant.
         */
        int[] itemsOrdered = new int[10]; // assuming that maximum 10 items for each bill
        char ch = 'y';
        int counter = 0;

        do {
            printMenu();
            int choice = 0;
            System.out.println("Enter the item number you wish to order");
            choice = Integer.parseInt(scanner.nextLine());
            // check if the number entered is possible to order and then add to the array!
            // itemsOrdered[counter] = choice;
            if (choice <= 0 || choice > menu.length) {
                System.out.println("Please Select From the Menu!!!");
            } else {
                int indexPos = choice - 1;
                itemsOrdered[counter] = indexPos;
                counter++;
            }

            if (counter < 10) {
                System.out.println("Do you want to add another item to the order (Press y/Y for yes)");
                ch = scanner.nextLine().charAt(0);
            } else {
                ch = 'n';
            }
        } while (ch == 'Y' || ch == 'y');
        // This Condition When the order is less than we expected in the array
        if (counter < 10) {

            int[] tempArr = new int[counter];
            System.arraycopy(itemsOrdered, 0, tempArr, 0, counter);
            float billAmount = computeAmount(tempArr);
            System.out.println("Total Bill Amount: " + billAmount);

        } else {
            float billAmount = computeAmount(itemsOrdered);
            System.out.println("Total Bill Amount: " + billAmount);
        }

        // Store the itemsOrdered array to the 'orders' array
        total_order[order_count++] = (int) computeAmount(itemsOrdered);
    }

    void printTotalSales() {
        /*
         * This function prints the orders and its total cost and print the total sales
         * for the restaurant. This function will be called for printing the total sales
         * of the restaurant for the day!
         */
        
    }
}

public class Lab02 {

    static void welcomeCafe() {
        /*
         * Complete the static function that creates a welcome message for your
         * application Stating the Restaurant Name, FSSAI Id, Date of Bill and usage
         * instructions
         */
        System.out.println("Welcome to our Restaurant");
        System.out.println("Christ ka Khana (0223152)");
        Date date = new Date();
        System.out.println("Date: " + date);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char ch = 'N';

        welcomeCafe();
        /*
         * Create the object for restaurant class and define a menu driven program that
         * uses the functions defined in the restaurant class with the help of the
         * object you have created and make the billing system for your cafe! Hint: Menu
         * Driven program calls the functions with the help of objects.
         */

        Restaurant myRestaurant = new Restaurant(); // Object of Restaurant Class

        do {
            int choice = 0;
            System.out.println("Enter the Choice");
            System.out.println("Menu:");
            System.out.println("1 For See The Menu ");
            System.out.println("2 For Give orders ");
            System.out.println("3 For Print Total Sales ");
            System.out.println("4 For Exit");

            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("My Menu");
                    myRestaurant.printMenu(); // calling function from the class using objects
                    break;
                case 2:
                    myRestaurant.generateBill(scanner);
                    break;
                case 3:
                    System.out.println("This feature ciurrently under maintanence:");
                    // myRestaurant.printTotalSales();
                    break;
                default:
                    System.out.println("Enter Any key on the keyboard for exiting");
                    break;
            }

            System.out.println("Do you want to continue (Press Y/y to continue)?");
            ch = scanner.nextLine().charAt(0);
        } while (ch == 'Y' || ch == 'y');

        myRestaurant.printTotalSales(); // print all the sales and sales summary

        System.out.println("Thank you for using Our Mind Blowing Application");
        scanner.close();
    }
}