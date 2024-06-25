package list;

import entites.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class EmployeesList {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many employees be registered? ");
        int quantity = scanner.nextInt();
        scanner.nextLine();
        List<Employee> list = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            System.out.printf("Employee #%d:", i + 1);
            System.out.print("Id: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            while(hasID(list, id)){
                System.out.println("Id already taken! Try again:  ");
                id = scanner.nextInt();
                scanner.nextLine();
            }
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine();

            Employee employee = new Employee(name, id, salary);

            list.add(employee);
        }
        System.out.print("Enter the employee id that will have salary increase : ");
        int idIcrease = scanner.nextInt();
        scanner.nextLine();
        Employee employee = list.stream().filter(x -> x.getId() == idIcrease ).findFirst().orElse(null );
        if(employee == null){
            System.out.println("This  id does not exist! ");
        }else{
            System.out.print("Enter the percentage: ");
            double percent = scanner.nextDouble();
            scanner.nextLine();
            employee.increaseSalary(percent);
        }
        System.out.println("List of employees: ");
        for (Employee employee1 : list){
            System.out.println(employee1);
        }
    }
    public static boolean hasID(List<Employee> list, int id){
        Employee employee = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return employee != null;
    }
}
