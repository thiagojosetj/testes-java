package application;

import java.util.Scanner;

import entities.Aluno;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.print("Enter the student's name: ");
        aluno.nome = sc.nextLine();

        System.out.println("Enter the 3 grades: ");
        aluno.nota1 = sc.nextDouble();
        aluno.nota2 = sc.nextDouble();
        aluno.nota3 = sc.nextDouble();

        System.out.println(aluno);

        sc.close();

    }
}
