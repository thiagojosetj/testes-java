import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float num = sc.nextFloat();
        float tax = 0;

        if(num > 0 && num <= 2000){
            System.out.println("Isento de imposto");
        }else if(num > 2000 && num <= 3000){
            tax = ((num - 2000) * 0.08f);
        }else if(num > 3000 && num <= 4500){
            tax = 80 + (num - 3000) * 0.18f;
        }else if(num > 4500){
            tax = 350 + (num - 4500) * 0.28f;
        }else{
            System.out.println("Valor inválido");
        }

        if(tax > 0){
            System.out.printf("Imposto: R$ %.2f%n", tax);
        }
        sc.close();
    }
}
