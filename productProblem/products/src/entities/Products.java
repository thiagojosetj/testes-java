package entities;

import java.util.Scanner;

public class Products {

    private double price;
    private int quantity;
    private String name;

    public Products() {
    }

    public Products(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double totalValueInStock(){
        return price * quantity;
    }

    public double add(int quantity){

        return this.quantity += quantity;

    }
    public void remove(int quantity) {
        Scanner sc = new Scanner(System.in);

        while (this.quantity < quantity) {
            System.out.println("Insufficient quantity in stock. Try again.");
            System.out.print("Enter a valid quantity to remove: ");
            quantity = sc.nextInt();
        }

        this.quantity -= quantity;

        sc.close();
        
    }

    public String toString(){
        return name + ", $" + String.format("%.2f", price) + ", " + quantity + " units, Total: $" + String.format("%.2f", totalValueInStock());
    }
}
