package aplicacoes;

import entites.Triangulo;

import java.util.Scanner;

public class PooTriangulo {
    public static void main(String[] args) {
        double areaX, areaY;

        Scanner sc = new Scanner(System.in);
        Triangulo x,y;
        x = new Triangulo();
        y = new Triangulo();

        System.out.println("Digite as medidas do triângulo X: ");
        x.ladoA = sc.nextDouble();
        x.ladoB = sc.nextDouble();
        x.ladoC = sc.nextDouble();

        System.out.println("Digite as medidas do triângulo Y: ");
        y.ladoA = sc.nextDouble();
        y.ladoB = sc.nextDouble();
        y.ladoC = sc.nextDouble();

        areaX = x.area();
        areaY = y.area();

        System.out.printf("A área do triangulo x é %.2f %n", areaX);
        System.out.printf("A área do triangulo Y é %.2f %n", areaY);
        if(areaX > areaX) {
            System.out.println("A maoir area é do X");
        }else{
            System.out.println("A maior area é do Y");
        }
        sc.close();
    }
}
