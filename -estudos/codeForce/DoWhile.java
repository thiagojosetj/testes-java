import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double c, f;
        char repetir;

        do{
            System.out.print("Digite a temperatura em Celsius: ");
            c = sc.nextDouble();
            f = 9.0 * c / 5.0 + 32.0;
            System.out.printf("A temperatura em Fahrenheit é: %.1f%n", f);
            System.out.println("Deseja repetir? (s/n)");
            repetir = sc.next().charAt(0);
        } while (repetir == 's');

        sc.close();
    }
}
