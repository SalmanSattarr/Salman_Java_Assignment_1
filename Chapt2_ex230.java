import java.util.Scanner;

public class Chapt2_ex230 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number consisting of only five digits no more and no less ....");
        int numbr_entrd = input.nextInt();
        int frst_numbr = (numbr_entrd / 10000);
        int scnd_numbr = ((numbr_entrd / 1000) % 10);
        int thrd_numbr = ((numbr_entrd / 100) % 10);
        int frth_numbr = ((numbr_entrd / 10) % 10);
        int fifh_numbr = (numbr_entrd % 10);
        //output of numbers with spacing format
        System.out.println(frst_numbr + " " + scnd_numbr + " " + thrd_numbr + " " + frth_numbr + " " + fifh_numbr);
        input.close();
    } // end main
} // end class