package polimofismo;

import polimofismo.entites.ImportedProduct;
import polimofismo.entites.Product;
import polimofismo.entites.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ProgramProduct {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        char commonUsedOrImported = ' '; 
        List<Product> productList = new ArrayList<>();
        System.out.print("Enter the number of products: ");
        int quantityProducts = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= quantityProducts; i++) {
            System.out.println("Product #" + i + " data:");
            while(true){
                System.out.print("Common, used or imported (C/U/I)? ");
                commonUsedOrImported = sc.nextLine().toUpperCase().charAt(0);
                if(commonUsedOrImported == 'C' || commonUsedOrImported == 'U' || commonUsedOrImported == 'I'){
                    break;
                }
                else{
                    System.out.println("Ivalid! Enter again.");
                }
            }
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            sc.nextLine();
            if(commonUsedOrImported == 'U'){
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date manufactureDate = dateFormat.parse(sc.nextLine());
                productList.add(new UsedProduct(name, price,manufactureDate));
            } else if (commonUsedOrImported == 'I'){
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();
                sc.nextLine();
                productList.add(new ImportedProduct(name, price, customsFee));
            }
            else{
                productList.add(new Product(name, price));
            }
        }
        System.out.println("PRICE TAGS");
        for(Product product : productList){
            System.out.println(product.priceTag());
        }
    }
}
