package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List <Employee> list = new ArrayList<>();

        System.out.println("How many employees will be registered?");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.println("Employee #" + (i+1) + ":"); 
            System.out.println("Id: ");
            Integer id = sc.nextInt();

            while (hasId(list, id)){
                System.out.println("This ID is already taken! Try again: ");
                id = sc.nextInt();
            }

            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.println("Salary: ");
            Double salary = sc.nextDouble();

            list.add(new Employee(id, name, salary));
        }

        System.out.println("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();

        Employee emp = findEmployeeById(list, id);

        if (emp == null) {
            System.out.println("This ID does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        }

        System.out.println("\nUpdated list of employees:");
        for (Employee e : list) {
            System.out.println(e);
        }

        sc.close();
    }

    private static boolean hasId(List<Employee> list, Integer id) {
        for (Employee e : list) {
            if (e.getId() == id) {
                return true;
            }
        }
        return false;
    }

    private static Employee findEmployeeById(List<Employee> list, int id) {
        for (Employee e : list) {
            if (e.getId() == id) {
                return e;
            }
        }
        return null;
    }
}
