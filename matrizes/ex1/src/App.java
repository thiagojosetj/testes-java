import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int n, m;

        System.out.println("Digite a quantidade de linhas na matriz: ");
        n = sc.nextInt();

        System.out.println("Digite a quantidade de colunas na matriz: ");
        m = sc.nextInt();

        int[][] mat = new int[n][m];

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                System.out.println("Digite a valor da posição " + i + "x" + j + ": ");
                mat[i][j] = sc.nextInt();
            }
        }

        int numero = 0;
        System.out.println("Escreva qual numero voce quer saber os vizinhos: ");
        numero = sc.nextInt();

        System.out.println("Matriz completa: ");
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                System.out.print(mat[i][j] + "  ");
                if(j == 2){
                    System.out.println();
                }
            }
        }
        
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                if(mat[i][j] == numero){
                    System.out.println("Position: " + i + "x" + j);
                    if(i > 0){
                        System.out.println("UP: " + mat[i-1][j]);
                    }
                    if(j > 0){
                        System.out.println("Left: " + mat[i][j-1]);
                    }
                    if(i < mat.length){
                        System.out.println("Down: " + mat[i+1][j]);
                    }
                    if(j < mat[i].length){
                        System.out.println("Right: " + mat[i][j+1]);
                    }
                }
            }
        }

        sc.close();

    }
}
