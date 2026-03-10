import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        boolean multiplos = false;

        if(num1 > num2){
            if(num1 % num2 == 0){
                multiplos = true;
            }else{
                multiplos = false;
            }
        }else if(num2 > num1){
            if(num2 % num1 == 0){
                multiplos = true;
            }else{
                multiplos = false;
            }
        }else{
            System.out.println("Os números são iguais.");
        }

        if (multiplos) {
            System.out.println("Os números são múltiplos.");
        } else {
            System.out.println("Os números não são múltiplos.");
        }

        sc.close();
    }
}