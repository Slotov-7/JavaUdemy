package vetores;

import java.util.Scanner;

public class NegativeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers will you type?");
        int quantity = scanner.nextInt();
        scanner.nextLine();
        int[] vector = new int[quantity];

        for (int i = 0; i < vector.length; i++) {
            System.out.printf("Enter the number %d: ", i + 1);
            vector[i] = scanner.nextInt();
            scanner.nextLine();
        }
        System.out.println("Negative Numbers:");
        for (int j : vector) {
            if (j < 0) {
                System.out.printf("%d %n", j);
            }
        }
    }
}
