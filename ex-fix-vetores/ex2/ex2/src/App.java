import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("Digite quantos numeros voce vai digitar: ");
        n = sc.nextInt();

        double[] vect = new double[n];

        for(int i = 0; i < vect.length; i++){
            System.out.println("Digite o " + (i+1) + "º" + " numero: ");
            double num = sc.nextDouble();
            vect[i] = num;
        }

        System.out.print("Numeros digitados: ");

        for(int i = 0; i < vect.length; i++){
            System.out.print(vect[i] + "  ");
        }

        double sum = 0;
        for(int i = 0; i < vect.length; i++){
            sum += vect[i];
        }

        System.out.println("\nSoma dos valores: " + sum);

        double media = sum / n;

        System.out.println("Media dos valores: " + media);

        sc.close();
    }
}
