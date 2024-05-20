package entertainment;

import java.io.FileWriter;
import java.io.IOException;

public class Book extends Media {

    private String[] Authors;
    private int no_Pages;
    private String ISSN_No;

    public Book(String Title, String Publisher, String Release_Year, String[] Authors, int no_Pages, String ISSN_No) {
        super(Title, Publisher, Release_Year);
        this.Authors = Authors;
        this.no_Pages = no_Pages;
        this.ISSN_No = ISSN_No;
    }

    public String[] getAuthors() {
        return Authors;
    }

    public int getNo_Pages() {
        return no_Pages;
    }

    public String getISSN_No() {
        return ISSN_No;
    }

    public void addEntryToFile() {
        try (FileWriter writer = new FileWriter("books.txt", true)) {
            writer.write(this.getTitle() + "," + this.getPublisher() + "," + this.getRelease_Year() + "," +
                    String.join(",", this.getAuthors()) + "," + this.getNo_Pages() + "," + this.getISSN_No() + "\n");
            System.out.println("Book entry added successfully to books.txt");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
