import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;
        for (int i = 1; i < n-1; i++) {
            sum += (long) i * (i + 1) / 2;
        }
        System.out.println(sum);
        System.out.print("3");
    }
}