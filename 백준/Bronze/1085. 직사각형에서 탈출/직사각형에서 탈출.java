import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        
        int a = w - x;
        int b = h - y;
        int c = (a < x) ? a : x;
        int d = (b < y) ? b : y;
        if (c < d) {
            System.out.print(c);
        } else {
            System.out.print(d);
        }
    }
}
