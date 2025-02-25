import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Enter the number of elements in the array: ");
        n = sc.nextInt();

        System.out.println("Enter the elements of the array: ");
        int[] vet = new int[n];

        for(int i = 0; i < n; i++){
            vet[i] = sc.nextInt();
        }

        double somaDosPares = 0;
        double contPares = 0;
        
        for(int i = 0; i < n; i++){
            if(vet[i] % 2 == 0){
                somaDosPares += vet[i];
                contPares++;
            }
        }

        if(contPares != 0){
            System.out.println("The average of the even numbers is: " + String.format("%.1f",somaDosPares/contPares));
        }else{
            System.out.println("There are no even numbers in the array.");
        }
            

        sc.close();
    }
}
