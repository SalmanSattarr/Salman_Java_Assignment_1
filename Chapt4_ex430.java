import java.util.Scanner;

public class Chapt4_ex430 {
    public static void main(String[] args) {
        Scanner dim = new Scanner(System.in);
        System.out.print("Enter the side dimension: ");
        int dim_size = dim.nextInt();
        if (dim_size < 1 || dim_size > 20) {
            System.out.println("Side dimension must be between 1-20");
        } else {
            // Display the hollow square
            asterikSquare(dim_size);
        }
        dim.close();
    }

    public static void asterikSquare(int dim) {
        for (int i = 1; i <= dim; i++) {
            System.out.print(" *");
        }
        System.out.println();
        for (int i = 2; i < dim; i++) {
            System.out.print(" *");
            for (int j = 2; j < dim; j++) {
                System.out.print("  ");
            }
            System.out.println(" *");
        }
        for (int i = 1; i <= dim; i++) {
            System.out.print(" *");
        }
        System.out.println();
    }
}