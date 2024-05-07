public abstract class LibraryItem {
    private String type;
    private int id;
    private String title;
    private int year;
    private double aveRating;
    private int numOfReviews;
    private int maxBorrowTime;
    LibraryItem(String type, int id, String title, int year) {
        setType(type);
        setId(id);
        setTitle(title);
        setYear(year);
    }

    public void setType(String type) { this.type = type; }
    public String getType() { return type; }
    public void setId(int id) { this.id = id; }
    public int getId() { return id; }
    public void setTitle(String title) { this.title = title; }
    public String getTitle() { return title;  }
    public void setYear(int year) { this.year = year; }
    public int getYear() { return year; }
    public void setAveRating(double aveRating) { this.aveRating = aveRating; }
    public double getAveRating() { return aveRating; }
    public void setNumOfReviews(int numOfReviews) { this.numOfReviews = numOfReviews; }
    public int getNumOfReviews() { return numOfReviews; }
    public void setMaxBorrowTime(int maxBorrowTime) { this.maxBorrowTime = maxBorrowTime; }
    public int getMaxBorrowTime() { return maxBorrowTime; }

    @Override
    public String toString() {
        return "ID: " + getId() +
                "\tType: " + getType() +
                "\tTitle: " + getTitle();
    }
}
