package vetores;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BelowAverage {
    public static void main(String[] args) {
        double sum =  0;
        double average = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers will you type? ");
        int quantity = scanner.nextInt();
        scanner.nextLine();
        double[] vector = new double[quantity];

        for (int i = 0; i < vector.length; i++) {
            System.out.printf("Enter the number %d: ", i + 1);
            vector[i] = scanner.nextDouble();
            scanner.nextLine();
            sum += vector[i];
        }
        average = sum / vector.length;
        System.out.printf("Average of vector = %.3f %n", average );
        System.out.println("Elements below average: ");
        for (double v : vector){
            if (v < average) {
                System.out.println(v);
            }
        }
    }
}
