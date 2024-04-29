// ******************************************** Class date
public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }
// ******************************************** Get methods
    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }
// ******************************************** Set Methods
    public void setDay(int day) {
        this.day = day;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public void setYear(int year) {
        this.year = year;
    }
 // ****************************************** Other methods
    public void displayDate() {
        System.out.printf("%d/%d/%d%n", day, month, year);
    }   
}