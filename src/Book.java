public class Book extends LibraryItem {
    private String author;
    private int pages;
    public Book(String type, int id, String title, int year, String author, int pages) {
        super(type,id,title,year);
        setAuthor(author);
        setPages(pages);
        setMaxBorrowTime(28);
    }

    public void setAuthor(String author) { this.author = author;}
    public String getAuthor() {return author;}
    public void setPages(int pages) {this.pages = pages;}
    public int getPages() {return pages;}

}
