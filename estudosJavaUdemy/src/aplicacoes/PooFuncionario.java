package aplicacoes;

import entites.Funcionario;

import java.util.Scanner;

public class PooFuncionario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario employee = new Funcionario();

        System.out.print("Name: ");
        employee.name = sc.nextLine();
        System.out.print("Gross salary: ");
        employee.gorssSalary = sc.nextDouble();
        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();
        System.out.println("Employee: " + employee);

        System.out.print("Which percentage to increase salary? ");
        employee.increaseSalary(sc.nextDouble());
        System.out.println("Update data: " + employee);

        sc.close();


    }
}
