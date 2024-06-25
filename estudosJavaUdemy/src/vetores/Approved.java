package vetores;

import entites.Student;

import java.util.Scanner;

public class Approved {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many students will be typed: ");
        int quantity = scanner.nextInt();
        scanner.nextLine();
        Student[] vector = new Student[quantity];
        for (int i = 0; i < vector.length; i++) {
            System.out.printf("Student %d %n", i + 1);
            System.out.println("Enter name :");
            String name = scanner.nextLine();
            System.out.println("Enter first grade: ");
            double firstGrade = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Enter second grade: ");
            double secondGrade = scanner.nextDouble();
            scanner.nextLine();
            vector[i] = new Student(name, firstGrade, secondGrade);
        }
        System.out.println("Approved Students");
        for (Student student : vector) {
            if (student.average(student.getFirstGrade(), student.getSecondGrade()) >= 6) {
                System.out.println(student.getName());
            }
        }
    }
}
