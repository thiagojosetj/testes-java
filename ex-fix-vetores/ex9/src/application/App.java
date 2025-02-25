package application;
import java.util.Scanner;
import pessoas.Pessoas;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();

        Pessoas[] pessoas = new Pessoas[n];     

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + "ª pessoa: ");
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            pessoas[i] = new Pessoas(nome, idade);
        }

        System.out.print("Pessoa mais velha: ");
        
        int maiorIdade = 0;
        int pos = 0;
        for(int i = 0; i < n; i++){
            if(pessoas[i].getIdade() > maiorIdade){
                maiorIdade = pessoas[i].getIdade();
                pos = i;
            }
        }
        System.out.println(pessoas[pos].getNome());

        sc.close();
    }
}
