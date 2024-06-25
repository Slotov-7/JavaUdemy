package vetores;

import java.util.Arrays;
import java.util.Scanner;

public class VectorSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers will you enter for each vector? ");
        int quantity = scanner.nextInt();
        scanner.nextLine();
        double[] vectorA = new double[quantity];
        double[] vectorB = new double[quantity];
        double[] vectorC = new double[quantity];
        System.out.println("Enter the values for vector A: ");
        for (int i = 0; i < vectorA.length; i++) {
            vectorA[i] = scanner.nextDouble();
            scanner.nextLine();
        }
        System.out.println("Enter the values for vector B: ");
        for (int i = 0; i < vectorA.length; i++) {
            vectorB[i] = scanner.nextDouble();
            scanner.nextLine();
        }
        System.out.println("Resultant vector");
        for (int i = 0; i < vectorA.length; i++){
            vectorC[i] = vectorA[i] + vectorB[i];
        }
        System.out.println(Arrays.toString(vectorC));
    }
}
