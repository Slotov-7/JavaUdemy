package vetores;

import entites.Person;

import java.util.Locale;
import java.util.Scanner;

public class AgeAndHeight {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double sum = 0, average = 0, percentage = 0;
        int quantity = 0, less16 = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many people will be entered: ");
        quantity = scanner.nextInt();
        scanner.nextLine();
        Person[] vector = new Person[quantity];
        for (int i = 0; i < vector.length; i++) {
            System.out.printf("Person %d data:  %n", i + 1);
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Height: ");
            double height = scanner.nextDouble();
            scanner.nextLine();
            vector[i] = new Person(name, age, height);
        }
        for (Person person : vector) {
            sum += person.getHeight();
            if (person.getAge() < 16) {
                less16++;
            }
        }
        average = sum / vector.length;
        percentage = ((double) less16 /vector.length) * 100;
        System.out.printf("Average height: %.2f %n", average);
        System.out.printf("People with less 16 age: %.1f %n", percentage);
        for (Person person : vector){
            if (person.getAge() < 16) {
                System.out.println(person.getName());
            }
        }
    }
}
