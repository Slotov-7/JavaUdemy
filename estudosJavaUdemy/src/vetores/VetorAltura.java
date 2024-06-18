package vetores;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class VetorAltura {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        int qtqPeople;
        double sum = 0;
        double average = 0;
        Scanner sr = new Scanner(System.in);
        qtqPeople = sr.nextInt();
        double[] heights = new double[qtqPeople];

        for(int i = 0; i < qtqPeople; i++){
            heights[i] = sr.nextDouble();
        }
        for(int i = 0; i < qtqPeople; i++){
          sum += heights[i];
        }
        average = sum/qtqPeople;

        System.out.printf("AVERAGE HEIGHT = %.2f", average);
    }
}
