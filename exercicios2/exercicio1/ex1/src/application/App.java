package application;
import entities.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Data Data = new Data();

        System.out.print("Enter account number: ");
        Data.setNumber(sc.nextInt());
        sc.nextLine();

        System.out.print("Enter account holder: ");
        Data.setName(sc.nextLine());

        System.out.print("Is there an initial deposit (y/n)? ");
        char response = sc.next().charAt(0);

        if(response == 'y'){
            System.out.print("Enter inicial deposit value: ");
            Data.setInitialDeposit(sc.nextDouble());
        }

        System.out.println(Data.toString());

        System.out.println("Enter a deposit value: ");
        Data.deposit(sc.nextDouble());;

        System.out.println(Data.toString());

        System.out.println("Enter a withdraw value: ");
        Data.withdraw(sc.nextDouble());

        System.out.println(Data.toString());

        sc.close();
    }
}
