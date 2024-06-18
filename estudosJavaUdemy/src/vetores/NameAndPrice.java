package vetores;

import entites.Products;

import java.util.Locale;
import java.util.Scanner;

public class NameAndPrice {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int quantity;
        double sum = 0, average = 0;
        System.out.println("Enter the quantity of product's: ");
        quantity = sc.nextInt();
        sc.nextLine();
        Products[] vector = new Products[quantity];
        for(int i = 0; i < vector.length; i++){
            System.out.printf("Enter the name of product %d %n", i + 1);
            String name = sc.nextLine();
            System.out.printf("Enter the price of product %d %n", i + 1);
            double price = sc.nextInt();
            vector[i]= new Products(name, price);
            sc.nextLine();
        }
        for (Products products : vector) {
            sum += products.getPrice();
        }
        average = sum / vector.length;
        sc.close();
        System.out.printf("AVERAGE PRICE = %.2f ", average);
    }
}
