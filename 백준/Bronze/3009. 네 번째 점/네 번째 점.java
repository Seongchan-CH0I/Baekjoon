import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int x1 = sc.nextInt(); int y1 = sc.nextInt();
        int x2 = sc.nextInt(); int y2 = sc.nextInt();
        int x3 = sc.nextInt(); int y3 = sc.nextInt();
        int X = 0; int Y = 0;
        
        if (x1 == x2) {
            X = x3;
        } else if (x1 == x3) {
            X = x2;
        } else if (x2 == x3) {
            X = x1;
        }

        if (y1 == y2) {
            Y = y3;
        } else if (y1 == y3) {
            Y = y2;
        } else if (y2 == y3) {
            Y = y1;
        }
        
        System.out.print(X + " " + Y);
    }
}
