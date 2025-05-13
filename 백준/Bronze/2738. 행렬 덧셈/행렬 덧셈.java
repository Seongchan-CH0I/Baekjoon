import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt(); 
        
        int[][] A = new int[N][M];
        int[][] B = new int[N][M];
        int[][] C = new int[N][M];

        for (int j = 0; j < N; j++) {
            for (int k = 0; k < M; k++) {
                A[j][k] = sc.nextInt();
            }
        }
        
        for (int j = 0; j < N; j++) {
            for (int k = 0; k < M; k++) {
                B[j][k] = sc.nextInt();
            }
        }

        for (int j = 0; j < N; j++) {
            for (int k = 0; k < M; k++) {
                C[j][k] = A[j][k] + B[j][k];
            }
        }
        
        
        for (int j = 0; j < N; j++) {
            for (int k = 0; k < M; k++) {
                System.out.print(C[j][k] + " ");
                if(k == M-1) {
                    System.out.println("");
                }
            }
        }
    }
}