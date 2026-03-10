import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int code = sc.nextInt();
        int amount = sc.nextInt();
        float price = 0;

        if(code == 1){
            price = 4;
        }else if(code == 2){
            price = 4.5f;
        }else if(code == 3){
            price = 5;
        }else if(code == 4){
            price = 2;
        }else if(code == 5){
            price = 1.5f;
        }else{
            System.out.println("Código inválido");
        }
        float total = price * amount;

        System.out.println("Total: R$" + total);

        sc.close();
    }
}
