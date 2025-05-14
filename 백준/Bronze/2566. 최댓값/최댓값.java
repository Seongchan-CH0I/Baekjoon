import java.util.*;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        int[][] A = new int[9][9];
        int max = 0;
        int a = 1;
        int b = 1;

        for (int j = 0; j < 9; j++) {
            for (int k = 0; k < 9; k++) {
                A[j][k] = sc.nextInt();
                if (A[j][k] > max) {
                    max = A[j][k];
                    a = j+1;
                    b = k+1;
                }
            }
        }
        
        System.out.println(max);
        System.out.print(a + " " + b);
        
        
    }
}
