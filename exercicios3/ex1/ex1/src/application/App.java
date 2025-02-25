package application;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Quantas alturas voce vai querer medir?");
        n = sc.nextInt();
        sc.nextLine();

        double[] heights = new double[n];

        for(int i = 0; i < heights.length; i++){
            System.out.print("Digite a altura " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
        }

        double sum = 0;
        for(int i = 0; i < n; i++){
            sum += heights[i];
        }

        System.out.println("A media das alturas é: " + sum / n);

        sc.close();        
    }
}
