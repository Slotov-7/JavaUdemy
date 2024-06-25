package vetores;

import entites.Person;

import java.util.Scanner;

public class DataPerson {
    public static void main(String[] args) {
        double shorterHeight = Double.MAX_VALUE, greaterHeight = Double.MIN_VALUE, sum = 0;
        int accWoman = 0, accMan = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many people will be entered: ");
        int quantity = scanner.nextInt();
        scanner.nextLine();
        Person[] vector = new Person[quantity];
        for (int i = 0; i < vector.length; i++) {
            System.out.printf("Person %d data:  %n", i + 1);
            System.out.print("Height: ");
            double height = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Gender: ");
            char gender = scanner.nextLine().toUpperCase().charAt(0);
            vector[i] = new Person(height, gender);
            if(vector[i].getHeight() > greaterHeight){
                greaterHeight = vector[i].getHeight();
            }
            if(vector[i].getHeight() < shorterHeight){
                shorterHeight = vector[i].getHeight();
            }
            if(vector[i].getGender() == 'F'){
                sum += vector[i].getHeight();



                accWoman++;
            }
            if(vector[i].getGender() == 'M'){
                accMan++;
            }
        }
        double averageWoman = sum / accWoman;
        System.out.println("Shorter height = " + shorterHeight);
        System.out.println("Greater height = " + greaterHeight);
        System.out.printf("Average height of women = %.2f %n ", averageWoman);
        System.out.println("Number Men = " + accMan);
    }
}
