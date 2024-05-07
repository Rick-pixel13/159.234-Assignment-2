public class Journal extends LibraryItem {
    private int volume;
    private int number;
    public Journal(String type, int id, String title, int year, int vol, int num) {
        super(type, id, title, year);
        setVolume(vol);
        setNumber(num);
        setMaxBorrowTime(14);
    }

    public void setVolume(int volume) { this.volume = volume; }
    public int getVolume() { return volume; }
    public void setNumber(int number) { this.number = number; }
    public int getNumber() { return number; }

}
