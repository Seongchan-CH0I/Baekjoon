import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); int M = sc.nextInt();
        sc.nextLine();

        char[][] arr = new char[N][M];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextLine().toCharArray();  
        }

        int min = 2500;
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                int B = 0;
                int W = 0;

                for (int x = 0; x < 8; x++) {
                    for (int y = 0; y < 8; y++) {
                        char sB = ((x+y) % 2 == 0) ? 'B' : 'W';
                        char sW = ((x+y) % 2 == 0) ? 'W' : 'B';

                        if (sB != arr[i+x][j+y]) {B++;}
                        if (sW != arr[i+x][j+y]) {W++;}

                    }
                }

                min = Math.min(min,Math.min(B, W));     
            }
        }

        System.out.print(min);
    }
}