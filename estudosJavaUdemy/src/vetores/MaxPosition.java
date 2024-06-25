package vetores;

import java.util.Scanner;

public class MaxPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double value = Double.MIN_VALUE;
        int position = 0;
        System.out.println("How many numbers will you type?");
        int quantity = scanner.nextInt();
        scanner.nextLine();
        int[] vector = new int[quantity];

        for (int i = 0; i < vector.length; i++) {
            System.out.printf("Enter the number %d: ", i + 1);
            vector[i] = scanner.nextInt();
            scanner.nextLine();
        }
        for (int j : vector) {
            if (j > value) {
                value = j;
            }
        }
        for (int i = 0; i < vector.length; i++){
            if(vector[i] == value){
                position = i;
            }
        }
        System.out.printf("Greater value: %f",value);
        System.out.printf("Position of greater value: %d",position);
    }
}
