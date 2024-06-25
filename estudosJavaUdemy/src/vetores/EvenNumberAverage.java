package vetores;

import java.util.Scanner;

public class EvenNumberAverage {
    public static void main(String[] args) {
        double sum =  0;
        double averageOfPairs = 0;
        int acc = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers will you type? ");
        int quantity = scanner.nextInt();
        scanner.nextLine();
        double[] vector = new double[quantity];

        for (int i = 0; i < vector.length; i++) {
            System.out.printf("Enter the number %d: ", i + 1);
            vector[i] = scanner.nextDouble();
            scanner.nextLine();
            if(vector[i] % 2 == 0){
                sum += vector[i];
                acc++;
            }
        }


        if(acc > 0){
            averageOfPairs = sum / acc;
            System.out.printf("Average of pairs: %.1f %n", averageOfPairs);
        }else{
            System.out.println("None even number");
        }
    }
}
