import java.util.Scanner;

public class Chapt2_ex225{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer... ");
        int input_value = input.nextInt();
        String output = (input_value % 2 == 0) ? "even" :"odd";
        System.out.println(input_value + " is an " + output + " integer.");
        input.close();
    } // end of main 
} // end of class