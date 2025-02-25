import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Digite quantos elementos vai ter o vetor: ");
        n = sc.nextInt();

        double[] vet = new double[n];

        for (int i = 0; i < n; i++){

            System.out.print("Digite um numero: ");
            vet[i] = sc.nextDouble();
        }

        double sum = 0;
        for(int i = 0; i < n; i++){
            sum += vet[i];
        }
        double media = sum / n;

        System.out.print("Media do vetor: " + media + "\n");

        System.out.println("Elementos abaixo da media: ");

        for(int i = 0; i < n; i++){
            if(vet[i] < media){
                System.out.println(vet[i]);
            }
        }
    
        sc.close();

    }
}
