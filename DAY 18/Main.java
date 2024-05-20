import entertainment.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add Movie");
            System.out.println("2. Add Book");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addMovie(scanner);
                    break;
                case 2:
                    addBook(scanner);
                    break;
                case 3:
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 3.");
            }
        }
    }

    private static void addMovie(Scanner scanner) {
        System.out.print("Enter movie title: ");
        String title = scanner.nextLine();
        System.out.print("Enter movie publisher: ");
        String publisher = scanner.nextLine();
        System.out.print("Enter release year: ");
        String releaseYear = scanner.nextLine();
        System.out.print("Enter director: ");
        String director = scanner.nextLine();
        System.out.print("Enter duration: ");
        String duration = scanner.nextLine();
        System.out.print("Enter genre: ");
        String genre = scanner.nextLine();
        System.out.print("Enter actors (comma-separated): ");
        String[] actors = scanner.nextLine().split(",");

        Movie movie = new Movie(title, publisher, releaseYear, director, duration, genre, actors);
        movie.addEntryToFile();
    }

    private static void addBook(Scanner scanner) {
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter book publisher: ");
        String publisher = scanner.nextLine();
        System.out.print("Enter release year: ");
        String releaseYear = scanner.nextLine();
        System.out.print("Enter authors (comma-separated): ");
        String[] authors = scanner.nextLine().split(",");
        System.out.print("Enter number of pages: ");
        int numPages = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter ISSN number: ");
        String issnNumber = scanner.nextLine();

        Book book = new Book(title, publisher, releaseYear, authors, numPages, issnNumber);
        book.addEntryToFile();
    }
}
