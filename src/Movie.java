public class Movie extends LibraryItem {
    private String director;
    public Movie(String type, int id, String title, int year, String director) {
        super(type, id, title, year);
        setDirector(director);
        setMaxBorrowTime(7);
    }

    public void setDirector(String director) { this.director = director; }
    public String getDirector() { return director; }

}
