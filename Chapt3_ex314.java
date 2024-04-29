public class Chapt3_ex314 {
    public static void main(String[] args) {
    Date date = new Date(16, 04, 2024);
    System.out.println("Todays date: " + date.getDay() + "/" + date.getMonth() + "/" + date.getYear());
    
    date.setDay(16);
    date.setMonth(04);
    date.setYear(2025);

    System.out.println("Same day next year date: ");
    date.displayDate();
    }
}