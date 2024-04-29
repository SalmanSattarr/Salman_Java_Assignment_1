public class Chapt4_ex422 {
    public static void main(String[] args){
    System.out.println("N\t10*N\t100*N\t1000*N");
    
        for (int i = 1; i <= 5; i++) {
            int timesten = 10 * i;
            int timeshundred = 100 * i;
            int timesthousand = 1000 * i;
            System.out.printf("%d\t%d\t%d\t%d%n", i, timesten, timeshundred, timesthousand);
        }
    }
}