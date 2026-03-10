import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int horas = 24;

        if(num1 > 24 || num2 > 24){
            System.out.println("Horário inválido");
        }else{
            if(num1 > num2){
                horas = num1 -24 + num2;
            }else if(num2 > num1){
                horas = num2 - num1;
            }
            System.out.println("O jogo durou " + horas + " horas.");
        }
        sc.close();
    }
}
