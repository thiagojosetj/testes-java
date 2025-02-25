package application;
import java.util.Scanner;
import entities.Produtos;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of products: ");
        int n = sc.nextInt();

        Produtos[] vect = new Produtos[n];

        for(int i = 0; i < vect.length; i++){

            String name;
            double preco;

            sc.nextLine();
            System.out.println("Enter the product name: ");
            name = sc.nextLine();
            System.out.println("Enter the product price: ");
            preco = sc.nextDouble();

            vect[i] = new Produtos(name, preco);
        }

        double sum = 0.0;
        for(int i = 0; i < vect.length; i++){

            sum += vect[i].getPreco();
        }
        double media = sum / vect.length;

        for(int i = 0; i < vect.length; i++){

            System.out.println(vect[i]);
        }

        System.out.printf("Average price: " + String.format("%.2f", media));

        sc.close();

    }
}
