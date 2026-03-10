import java.util.Scanner;

public class ExBord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int size = n*m;

        if(n == 0 || m == 0){
            System.out.println(0);
        }else if(size % 2 == 0){
            System.out.println(size/2);
        }else{
            System.out.println((size-1)/2);
        }

        sc.close();
    }
}
