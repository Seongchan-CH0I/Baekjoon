import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int x = 10000;
        int y = 10000;
        int x2 = -10000;
        int y2 = -10000;

        for (int i = 0; i < N; i++) {
            int xx = sc.nextInt();
            int yy = sc.nextInt();
            if (x > xx) {
                x = xx;
            }
            if (y > yy) {
                y = yy;
            }
            if (x2 < xx) {
                x2 = xx;
            }
            if (y2 < yy) {
                y2 = yy;
            }
        }

        System.out.print((x-x2) * (y-y2));
    }
}