import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt(); int a2 = sc.nextInt();
        int c = sc.nextInt();
        int n0 = sc.nextInt();

        int a = a1 * n0 + a2;
        int b = c * n0;

        if (a > b) {
            System.out.print("0");
        } else {
            if (c < a1) {
            System.out.print("0");
            } else {
            System.out.print("1");
            }
        }

        
        
    }
}