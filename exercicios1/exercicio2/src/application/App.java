package application;
import java.util.Scanner;

import entities.Employee;

public class App {
    public static void main(String[] args) throws Exception {

        Employee employee = new Employee();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        employee.name = sc.nextLine();
        System.out.print("Enter employee gross salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Enter employee tax: ");
        employee.tax = sc.nextDouble();

        System.out.println(employee);

        System.out.print("Which percentage to increase salary?");
        employee.IncreaseSalary(sc.nextDouble());

        System.out.print("Updated " + employee);

        sc.close();
    }
}
