import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 1;
        for (int i = 0; i < N; i++) {
            sum *= 2;
        }

        System.out.print((sum+1) * (sum+1));

    }


}