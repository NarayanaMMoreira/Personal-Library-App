public class Books {
    private String title;
    private String author;
    private int year;
    private String genre;

    public Books(String title, String author, int year, String genre){
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }
}
