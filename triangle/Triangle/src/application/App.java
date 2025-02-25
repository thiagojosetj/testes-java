package application;

import java.util.Scanner;
import entities.Triangle;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Triangle triangle1 = new Triangle();

        System.out.println("Digite o valor dos lados do triângulo: ");
        triangle1.a = sc.nextDouble();
        triangle1.b = sc.nextDouble();
        triangle1.c = sc.nextDouble();

        if (triangle1.a + triangle1.b > triangle1.c && 
            triangle1.a + triangle1.c > triangle1.b && 
            triangle1.b + triangle1.c > triangle1.a) {

            System.out.println("Área do triângulo: " + triangle1.area());
            System.out.println("Perímetro do triângulo: " + triangle1.perimetro());

        } else {
            System.out.println("Os valores informados não formam um triângulo.");
        }

        sc.close();
    }
}
