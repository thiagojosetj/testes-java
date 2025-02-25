import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("Quantos valores vai ter cada vetor?");
        n = sc.nextInt();

        int[] vetA = new int[n];
        int[] vetB = new int[n];

        System.out.println("Digite os valores do vetor A:");
        for(int i = 0; i < n; i++){
            vetA[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B:");

        for(int i = 0; i < n; i++){
            vetB[i] = sc.nextInt();
        }

        System.out.println("VETOR RESULTANTE:");

        for(int i = 0; i < n; i++){
            int sum = vetA[i] + vetB[i];
            System.out.println(sum);
        }

        sc.close();
    }
}