package vetores;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int acc = 0;
        System.out.println("How many numbers will you type?");
        int quantity = scanner.nextInt();
        scanner.nextLine();
        int[] vector = new int[quantity];

        for (int i = 0; i < vector.length; i++) {
            System.out.printf("Enter the number %d: ", i + 1);
            vector[i] = scanner.nextInt();
            scanner.nextLine();
        }
        System.out.println("Pair Numbers:");
        for (int j : vector) {
            if (j % 2 == 0) {
                System.out.printf("%d  ", j);
                acc++;
            }
        }
        System.out.println();
        System.out.printf("Quantity of pair = %d", acc );
    }
}
