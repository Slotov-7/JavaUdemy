package vetores;

import ultil.RentForStudents;

import java.util.Scanner;

public class RentRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wow many rooms will be rented? ");
        int quantity = scanner.nextInt();
        scanner.nextLine();
        RentForStudents[] vector = new RentForStudents[10];
        for (int i = 0; i < quantity; i++) {
            System.out.printf("Rent #%d %n", i + 1);
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();
            System.out.print("Room: ");
            int room = scanner.nextInt();
            scanner.nextLine();
            vector[room] = new RentForStudents(name, email);
        }
        System.out.println("Busy roooms:");
        for (int i = 0; i < vector.length; i++) {
            if(vector[i] != null){
                System.out.printf( "%d%s", i,  vector[i]);
            }
        }
    }
}
