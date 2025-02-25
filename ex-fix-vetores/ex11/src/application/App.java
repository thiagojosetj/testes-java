package application;
import java.util.Scanner;

import pessoas.Pessoas;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int n = 0;

        System.out.println("Quantas pessoas serao digitadas? ");
        n = sc.nextInt();
        sc.nextLine();

        Pessoas[] pessoas = new Pessoas[n];
        for(int i = 0; i < n; i++){
            System.out.println("Altura da pessoa " + (i + 1) + ": ");
            double h = sc.nextDouble();
            sc.nextLine();
            System.out.println("Genero da pessoa: ");
            char sexo = sc.nextLine().charAt(0);

            pessoas[i] = new Pessoas(h, sexo);
        }

        double menor = pessoas[0].getH();
        for(int i = 1; i < n; i++){
            if(pessoas[i].getH() < menor){
                menor = pessoas[i].getH();
            }
        }
        System.out.println("Menor altura: " + menor);

        double maior = pessoas[0].getH();
        for(int i = 1; i < n; i++){
            if(pessoas[i].getH() > maior){
                maior = pessoas[i].getH();
            }
        }
        System.out.println("Maior altura: " + maior);

        double sum = 0;
        int count = 0;
        for(int i = 0; i < n; i++){
            if(pessoas[i].getSexo() == 'F'){
                sum += pessoas[i].getH();
                count++;
            }
        }
        System.out.println("media das alturas das mulheres: " + String.format("%.2f",sum/count));

        System.out.println("Numero de homens: " + (n - count));
        sc.close();
    }
}
