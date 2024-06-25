package vetores;

import java.util.Scanner;

public class SumAndAverage {
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

        System.out.print("Values = ");
        for (double j : vector) {
            System.out.printf("%.2f ", j);
        }
        System.out.println();
        System.out.printf("Sum = %.2f %n", sum);
        System.out.printf("Average = %.2f", average);

    }
}
