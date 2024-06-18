package aplicacoes;

import ultil.Cambium;

import java.util.Locale;
import java.util.Scanner;

public class PooCambium {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        double priceDollar = 0, qtdDollar =0;
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        priceDollar = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        qtdDollar = sc.nextDouble();
        System.out.printf("Amount to be paid in reais = %.2f", Cambium.cambium(priceDollar, qtdDollar));
    }
}
