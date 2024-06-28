package polimofismo;

import polimofismo.entites.Employee;
import polimofismo.entites.Outsourceemployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char outsourcedYesOrNo = ' ';
        List<Employee> employeeList = new ArrayList<>();
        System.out.print("Enter the number of employees: ");
        int quantityOfEmployees = sc.nextInt();

        for (int i = 1; i <= quantityOfEmployees ; i++) {
            sc.nextLine();
            System.out.println("Employee #" + i +" data:" );
            while(true){
                System.out.print("Outsourced (y/n)? ");
                outsourcedYesOrNo = sc.nextLine().toUpperCase().charAt(0);
                if(outsourcedYesOrNo == 'Y' || outsourcedYesOrNo == 'N'){
                    break;
                }
                else{
                    System.out.println("Ivalid! Enter again.");
                }
            }
            System.out.print("Name: ");
            String employeeName = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            sc.nextLine();
            System.out.print("Value per hour: ");
            double valuePerHour= sc.nextDouble();
            if (outsourcedYesOrNo == 'Y'){
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                employeeList.add(new Outsourceemployee(employeeName, hours, valuePerHour, additionalCharge));
            }
            else{
              employeeList.add(new Employee(employeeName, hours, valuePerHour));
            }
        }
        System.out.println();
        System.out.println("PAYMENT: ");
        for(Employee employee : employeeList){
            System.out.println(employee.name() + "- $ " + employee.payment());
        }
    }
}
