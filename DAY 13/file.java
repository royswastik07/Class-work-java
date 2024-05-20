import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class file {
    public static void main(String[] args) {
        try {
            File my_file = new File("trial1.txt");

            if (my_file.createNewFile()) {
                System.out.println("New file created: " + my_file.getName());
            }

            else {
                System.out.println("File already exists.");
            }

            FileWriter writer = new FileWriter("trial1.txt", true); // True is kept so that next lines can be appended.
            writer.write("First line \n");
            writer.close();

            Scanner reader = new Scanner(my_file);
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();

        } catch (IOException e) {
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }
}
