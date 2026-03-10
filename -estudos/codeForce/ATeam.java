import java.util.Scanner;

public class ATeam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int p, v, t;
        int cont = 0;

        for(int i = 0; i < n; i++){
            p = sc.nextInt();
            v = sc.nextInt();
            t = sc.nextInt();
            if(p + v + t >= 2){
                cont++;
            }
        }

        System.out.println(cont);

        sc.close();
    }
}
