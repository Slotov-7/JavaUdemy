package matrix;

import java.util.Scanner;

public class MatrixUpDownLeftRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number line: ");
        int line = scanner.nextInt();
        System.out.print("Enter the number column: ");
        int column = scanner.nextInt();
        int[][] matrix = new int[line][column];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter the number to search: ");
        int number = scanner.nextInt();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == number){
                    System.out.printf("Posicion: %d,%d %n", i, j);
                    if(j > 0){
                        System.out.println("Left: " + matrix[i][j-1]);
                    }
                    if(i > 0){
                        System.out.println("Up: " + matrix[i-1][j]);
                    }
                    if(j < matrix[i].length - 1){
                        System.out.println("Right: " + matrix[i][j+1]);
                    }
                    if(i < matrix[i].length - 1){
                        System.out.println("Down: " + matrix[i+1][j]);
                    }
                }

            }
        }
    }
}
