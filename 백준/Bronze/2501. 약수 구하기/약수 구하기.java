import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            ArrayList arr = new ArrayList<>();

            int N = sc.nextInt();
            for (int i = 1; i <= N; i++) {
                if (N % i == 0) {
                    arr.add(i);
                }
            }

            int K = sc.nextInt() - 1;
            if (K < arr.size()) {
                System.out.print(arr.get(K));
            } else {
                System.out.print("0");
            }
    }
}