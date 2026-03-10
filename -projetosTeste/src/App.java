import java.util.ArrayList;
import java.util.Scanner;

import projetos.*;

public class App {
    public static void main(String[] args) {

        int escolha = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual dos projetos voce deseja usar: ");
        System.out.print(
                "1- Calculadora \n2- Sistemas de notas \n3- cadastro de produtos \n4- Jogo de advinhação \n5- Caixa eletronico \n");

        String entrada;

        while (true) {

            System.out.println("Digite uma opção:");

            entrada = sc.nextLine();

            try {
                escolha = Integer.parseInt(entrada);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Digite apenas números.");
            }
        }

        switch (escolha) {
            case 1:
                int operacao = 0, num1, num2;
                Calculadora calc = new Calculadora();

                while (true) {
                    System.out.println("Qual operação voce deseja realizar: ");
                    System.out.println(
                            "1- Adição \n2- Subtração \n3- Multiplicação \n4- Divisão \n0- Cancelar operações");

                    entrada = sc.nextLine();

                    try {
                        operacao = Integer.parseInt(entrada);
                    } catch (NumberFormatException e) {
                        System.out.println("Digite apenas números.\n");
                        continue;
                    }

                    if (operacao == 0) {
                        System.out.println("Saindo da calculadora...");
                        break;
                    }

                    System.out.print("Escolha o primeiro valor: ");
                    entrada = sc.nextLine();

                    try {
                        num1 = Integer.parseInt(entrada);
                    } catch (NumberFormatException e) {
                        System.out.println("O primeiro valor deve ser numérico.");
                        continue;
                    }

                    System.out.print("Escolha o segundo valor: ");
                    entrada = sc.nextLine();

                    try {
                        num2 = Integer.parseInt(entrada);
                    } catch (NumberFormatException e) {
                        System.out.println("O segundo valor deve ser numérico.");
                        continue;
                    }

                    switch (operacao) {
                        case 1:
                            System.out.println(num1 + " + " + num2 + " = " + calc.adicao(num1, num2));
                            break;
                        case 2:
                            System.out.println(num1 + " - " + num2 + " = " + calc.subtracao(num1, num2));
                            break;
                        case 3:
                            System.out.println(num1 + " * " + num2 + " = " + calc.multiplicacao(num1, num2));
                            break;
                        case 4:
                            try {
                                System.out.println(num1 + " / " + num2 + " = " + calc.divisao(num1, num2));
                            } catch (ArithmeticException e) {
                                System.out.println("ERRO! Divisão por zero não é possível.");
                            }
                            break;
                        default:
                            System.out.println("Operação inválida! Tente novamente.");
                            break;
                    }
                }
                break;

            case 2:

                ArrayList<SistemasDeNotas> alunos = new ArrayList<>();
                String resposta = "s";

                while (resposta.equalsIgnoreCase("s")) {

                    int n1 = 0, n2 = 0, n3 = 0;
                    boolean valido = false;

                    System.out.print("Informe o nome do(a) aluno(a): ");
                    String nome = sc.nextLine();

                    System.out.println("Informe as notas do aluno: ");

                    System.out.print("Nota 1: ");
                    while (!valido) {
                        entrada = sc.nextLine();
                        try {
                            n1 = Integer.parseInt(entrada);
                            valido = true;
                        } catch (NumberFormatException e) {
                            System.out.println("O valor deve ser numérico.");
                        }
                    }

                    valido = false;

                    System.out.print("Nota 2: ");
                    while (!valido) {
                        entrada = sc.nextLine();
                        try {
                            n2 = Integer.parseInt(entrada);
                            valido = true;
                        } catch (NumberFormatException e) {
                            System.out.println("O valor deve ser numérico.");
                        }
                    }

                    valido = false;

                    System.out.print("Nota 3: ");
                    while (!valido) {
                        entrada = sc.nextLine();
                        try {
                            n3 = Integer.parseInt(entrada);
                            valido = true;
                        } catch (NumberFormatException e) {
                            System.out.println("O valor deve ser numérico.");
                        }
                    }

                    SistemasDeNotas aluno = new SistemasDeNotas(nome, n1, n2, n3);
                    alunos.add(aluno);

                    System.out.printf("A média do(a) aluno(a) %s é: %.2f%n", aluno.getNome(), aluno.getMedia());

                    System.out.print("Deseja adicionar mais alunos? (s/n): ");
                    resposta = sc.nextLine();
                }

                System.out.println("\nLista de alunos cadastrados:");
                for (SistemasDeNotas aluno : alunos) {
                    System.out.printf("Nome: %s | Média: %.2f | Situação final: %s%n", aluno.getNome(), aluno.getMedia(), aluno.situacaoFinal());
                }

                break;

                case 3:

                    System.out.print("Informe o nome do produto a ser inserido: ");
                    String nome = sc.nextLine();

                    int qnt = 0, valor = 0;

                    boolean valido = false;

                    System.out.print("Informe a quantidade de produto em estoque: ");
                    while (!valido) {
                        entrada = sc.nextLine();
                        try {
                            qnt = Integer.parseInt(entrada);
                            valido = true;
                        } catch (NumberFormatException e) {
                            System.out.println("O valor deve ser numérico.");
                        }
                    }

                    valido = false;

                    System.out.print("Informe o valor do produto: ");
                    while (!valido) {
                        entrada = sc.nextLine();
                        try {
                            valor = Integer.parseInt(entrada);
                            valido = true;
                        } catch (NumberFormatException e) {
                            System.out.println("O valor deve ser numérico.");
                        }
                    }

                    CadastroProdutos prod = new CadastroProdutos(nome, qnt, valor);
                    System.out.println(prod);

                    while(true){
                        System.out.println("Deseja realizar alguma operação?");
                        System.out.println("1- Inserir estoque\n2- Remover estoque\n3- Atualizar preço\n4- Vizualizar estoque\n");
                        
                    }

                case 4:



                case 5:



                default:
                    System.out.println("Opção inválida.");
                    break;
        }
        sc.close();
    }
}