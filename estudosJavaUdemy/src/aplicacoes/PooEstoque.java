package aplicacoes;
import entites.Estoque;

import java.util.Scanner;

public class PooEstoque {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product data");
        System.out.print("Name: ");
        String productName = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity: ");
        int quantity = sc.nextInt();

        Estoque product = new Estoque(productName, price, quantity);

        System.out.println("Product data: " + product);
        System.out.println();

        product.setPrice(100);
        System.out.print("Enter the number of products to be added in stock: ");
        product.addProducts(sc.nextInt());
        System.out.println();
        System.out.println("Update data: " + product);
        System.out.println();

        System.out.print("Enter the number of products to be removed from stock: ");
        product.removeProducts(sc.nextInt());
        System.out.println();
        System.out.println("Update data: " + product);

        sc.close();
    }
}
