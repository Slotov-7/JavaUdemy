package ternario;

import java.util.Scanner;

public class Ternario {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o valor: ");
        double valor = scanner.nextDouble();
        double descont = (valor < 20.0) ? valor * 0.1 :  valor * 0.05;

        System.out.println(valor);
        System.out.println(descont);
    }
}
