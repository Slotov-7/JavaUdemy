package vetores;

import entites.Person;

import java.util.Scanner;

public class Older212 {
    public static void main(String[] args) {
        int value = Integer.MIN_VALUE;
        String older = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many people will be entered: ");
        int quantity = scanner.nextInt();
        scanner.nextLine();
        Person[] vector = new Person[quantity];
        for (int i = 0; i < vector.length; i++) {
            System.out.printf("Person %d data:  %n", i + 1);
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            vector[i] = new Person(name, age);
        }
        for (Person person : vector) {
            if (person.getAge() > value) {
                value = person.getAge();
            }
        }
        for (Person person : vector) {
            if (value == person.getAge()) {
                System.out.printf("Older person: %s", person.getName());
            }
        }
    }
}
