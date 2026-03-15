package avaliarcarros.src.app;

import java.util.ArrayList;
import java.util.Scanner;

import avaliarcarros.src.*;
import avaliarcarros.src.model.Carro;
import avaliarcarros.src.service.CarroService;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String entrada = "", nomeCarro;
        int escolha = 999;

        ArrayList<CarroService> carroService = new ArrayList<>();

        while(escolha != 0){

            System.out.println("O que deseja fazer?");
            System.out.println("0- Fechar programa.");
            System.out.println("1- Listar carros.");
            System.out.println("2- Listar carros com pontos positivos e negativos.");
            System.out.println("3- Adicionar carro.");
            System.out.println("4- Atualizar pontos de carro.");
            System.out.println("5- Remover carro.");
    
            while (true) {

                entrada = sc.nextLine();
    
                try {
                    escolha = Integer.parseInt(entrada);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Digite apenas números.");
                }
            }

            switch (escolha) {
                case 0:
                    break;
                
                case 1:

                    for (CarroService carros : carroService) {
                        System.out.println(carros);
                    }

                    break;

                case 2:

                    break;

                case 3:

                    System.out.print("Digite o nome do carro a ser adicionado: ");
                    nomeCarro = sc.nextLine();

                    carroService.add(new CarroService(nomeCarro));

                    break;

                case 4:

                    break;

                case 5:

                    break;
            
                default:
                    
                    System.out.println("Opção inválida!");

                    break;
            }
        }

    }
}