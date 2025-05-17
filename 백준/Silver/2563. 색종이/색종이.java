import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        boolean[][] area = new boolean[100][100];
        int total = 0;
        
        for (int k = 0; k<N; k++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            for (int i = x; i < x + 10; i++) {
                for (int j = y; j < y + 10; j++) {
                    if (!area[i][j]) {
                        area[i][j] = true;
                        total ++;
                    }
                    
                }
            }
        }
        
        System.out.print(total);
        
    }
}