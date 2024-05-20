package entertainment;

public class Media {
    private String Title;
    private String Publisher;
    private String Release_Year;

    Media(String Title, String Publisher, String Release_Year) {
        this.Title = Title;
        this.Publisher = Publisher;
        this.Release_Year = Release_Year;
    }

    public String getTitle() {
        return Title;
    }

    public String getPublisher() {
        return Publisher;
    }

    public String getRelease_Year() {
        return Release_Year;
    }

    public String print_media_details() {
        return "Title: " + Title + ", Publisher: " + Publisher + ", Release Year: " + Release_Year;
    }
}


