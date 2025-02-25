package application;

import java.util.Scanner;

import alunos.Alunos;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantos alunos serao digitados?" );
        int n = sc.nextInt();

        Alunos[] alunos = new Alunos[n];


        for(int i = 0; i < n; i++){
            sc.nextLine();
            System.out.print("Digite o nome do " + (i+1) + " aluno: ");
            String nome = sc.nextLine();
            System.out.print("Digite a primeira nota: ");
            double nota1 = sc.nextDouble();
            System.out.print("Digite a segunda nota: ");
            double nota2 = sc.nextDouble();

            alunos[i] = new Alunos(nome, nota1, nota2);
        }

        System.out.println("Alunos aprovados: ");
        for(int i = 0; i < n; i++){
            if(alunos[i].media() >= 6.0){
                System.out.println(alunos[i].getNome());
            }
        }
        sc.close();
    }
}
