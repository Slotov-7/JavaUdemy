package matrix;

import java.util.Scanner;

public class MainDiagonal {
    public static void main(String[] args) {
        int acc = 0;
        Scanner scanner = new Scanner(System.in);
        int lineAndColumn = scanner.nextInt();
        scanner.nextLine();
        int[][] matrix = new int[lineAndColumn][lineAndColumn];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Main Diagonal: ");
        for(int i = 0; i < matrix.length; i++){
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                if (anInt < 0) {
                    acc++;
                }
            }
        }
        System.out.printf("Negative Numbers = %d", acc);
    }
}
