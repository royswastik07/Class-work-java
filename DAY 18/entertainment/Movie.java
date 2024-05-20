package entertainment;

import java.io.FileWriter;
import java.io.IOException;

public class Movie extends Media {

    private String Director;
    private String Duration;
    private String Genre;
    private String[] Actors;

    public Movie(String Title, String Publisher, String Release_Year, String Director, String Duration, String Genre, String[] Actors) {
        super(Title, Publisher, Release_Year);
        this.Director = Director;
        this.Duration = Duration;
        this.Genre = Genre;
        this.Actors = Actors;
    }

    public String getDirector() {
        return Director;
    }

    public String getDuration() {
        return Duration;
    }

    public String getGenre() {
        return Genre;
    }

    public String[] getActors() {
        return Actors;
    }

    public void addEntryToFile() {
        try (FileWriter writer = new FileWriter("movies.txt", true)) {
            writer.write(this.getTitle() + "," + this.getPublisher() + "," + this.getRelease_Year() + "," +
                    this.getDirector() + "," + this.getDuration() + "," + this.getGenre() + "," +
                    String.join(",", this.getActors()) + "\n");
            System.out.println("Movie entry added successfully to movies.txt");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
