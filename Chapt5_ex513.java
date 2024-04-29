public class Chapt5_ex513 {
    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("Integer\t\t\tFactorial");
        for (int i = 1; i <= 20; i++) {
            long factorial = findFact(i);
            System.out.println(i + "\t\t\t" + factorial);
        }
    }
    public static long findFact(int x) {
        long factorial = 1;
        for (int i = 1; i <= x; i++) {
            factorial *= i;
        }
        return factorial;
    }
}