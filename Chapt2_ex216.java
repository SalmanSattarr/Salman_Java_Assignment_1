import java.util.Scanner;

public class Chapt2_ex216 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number please ... ");
        int firstNumb = input.nextInt();
        System.out.println("Enter the second number please ... ");
        int secondNumb = input.nextInt();

        int largeNumb;
        if (firstNumb > secondNumb) {
            largeNumb = firstNumb;
        } else if (secondNumb > firstNumb) {
            largeNumb = secondNumb;
        } else {
        System.out.println("Numbers are equal");
        input.close();
        return;
    }
    System.out.println("The larger of the numbers entered is: " + largeNumb);
    input.close();
    }
}
