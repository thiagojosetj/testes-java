import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int n;
        int sum = 0;

        System.out.print("Enter the number of numbers you want to enter: ");
        n = sc.nextInt();

        double[] arr = new double[n];

        for(int i = 0; i < n; i++){
            System.out.print("Enter the number: ");
            arr[i] = sc.nextDouble();
        }

        System.out.println("Even numbers: ");
        for(int i = 0; i < n; i++){
            if(arr[i] % 2 == 0){
                System.out.print(arr[i] + "     ");
                sum++;
            }
        }

        System.out.println("\nQuantidade de numeros pares= " + sum);

        sc.close();
    }
}
