package aplicacoes;

import entites.Client;
import entites.Order;
import entites.OrderItem;
import entites.Products;
import entites.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ProgramOlder {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());

        Client client = new Client(name, email, birthDate);

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());
        Order order = new Order(new Date(), status, client);
        System.out.print("How many items to this order? ");
        int quantity = sc.nextInt();

        for (int i = 0; i < quantity; i++){
        System.out.println("Enter #" + (i + 1) + " item data: ");
            sc.nextLine();
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int productQuantity = sc.nextInt();
            Products products = new Products(productName, productPrice);

            OrderItem item = new OrderItem(productQuantity, productPrice, products);

            order.addItem(item);
        }
        System.out.println();
        System.out.println(order);
    }
}
