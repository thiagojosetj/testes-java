package application;
import java.util.Scanner;

import data.Pessoas;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serão cadastradas?");
        int n = sc.nextInt();

        Pessoas[] pessoas = new Pessoas[n];

        for(int i = 0; i < n; i++){
            System.out.println("Dados da " + (i+1) + "ª pessoa:");
            sc.nextLine();
            System.out.println("Nome:");
            String nome = sc.nextLine();
            System.out.println("Idade:");
            int idade = sc.nextInt();
            System.out.println("Altura:");
            double altura = sc.nextDouble();

            pessoas[i] = new Pessoas(nome, idade, altura);
        }

        System.out.println("Altura media: " + Pessoas.alturaMedia(pessoas));

        System.out.println("Pessoas com menos de 16 anos: " + Pessoas.menorDe16(pessoas));

        sc.close();

    }
}
