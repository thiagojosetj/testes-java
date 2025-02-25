package application;

import java.util.Scanner;

import util.CurrencyConverter;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        CurrencyConverter.dollarPrice = sc.nextDouble();

        System.out.print("How many dollars will be bought? ");
        CurrencyConverter.amount = sc.nextDouble();

        System.out.println(CurrencyConverter.convert());

        sc.close();

    }
}
