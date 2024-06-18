package aplicacoes;

import entites.Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class PooRetangulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Retangulo rectangle = new Retangulo();
        System.out.println("Enter rectangle width and heigth:");
        rectangle.width = sc.nextDouble();
        sc.nextLine();
        rectangle.heigth = sc.nextDouble();

        System.out.println(rectangle);
        sc.close();
    }
}
