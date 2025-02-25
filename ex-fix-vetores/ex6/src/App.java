import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("Quantos numeros voce vai digitar?");
        n = sc.nextInt();

        double vet[] = new double[n];
        for(int i = 0; i < n; i++){
            System.out.print("Digite um numero:");
            vet[i] = sc.nextDouble();
        }

        int sum = 0;
        double maior = vet[0];
        for (int i = 1; i < n; i++) {
            if (vet[i] > maior) {
                maior = vet[i];
                sum = i;
            }
        }

        System.out.println("MAIOR VALOR = " + maior);

        System.out.println("Posicao do maior valor: " + sum);
        sc.close();
    }
}
