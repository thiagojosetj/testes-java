package application;

import java.util.Scanner;

import entities.*;

public class App {
    public static void main(String[] args) throws Exception {

        Products product = new Products();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data:");
        System.out.print("Name: ");
        product.setName(sc.nextLine());
        System.out.print("Price: ");
        product.setPrice(sc.nextDouble());
        System.out.print("Quantity in stock: ");
        product.setQuantity(sc.nextInt());

        System.out.println(product);

        System.out.println("Enter the number of products to be added in stock: ");
        product.add(sc.nextInt());

        System.out.println("Updated data: " + product.getName() + ", $" + product.getPrice() + ", " + product.getQuantity() + " units, Total: $ " + product.totalValueInStock());

        System.out.println("Enter the number of products to be removed from stock: ");
        product.remove(sc.nextInt());

        System.out.println("Updated data: " + product.getName() + ", $" + product.getPrice() + ", " + product.getQuantity() + " units, Total: $ " + product.totalValueInStock());

        System.out.println("product data: " + product);
        
        sc.close();
    }
}
