import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float num = sc.nextFloat();
        String intervalo;

        if(num >= 0 && num < 25){
            intervalo = "0-25";
            System.out.println("Intervalo: " + intervalo);   
        }else if(num >= 25 && num < 50){   
        }else if(num >= 50 && num < 75){   
        }else if(num >= 75 && num <= 100){   
        }

        sc.close();
    }
}
