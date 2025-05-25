import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        String[] arr = new String[T];

        for (int i = 0; i < T; i++) {
            int gsrd = sc.nextInt();
            int q = gsrd / 25;
            int d = (gsrd % 25) / 10;
            int n = ((gsrd % 25) % 10) / 5;
            int p = ((gsrd % 25) % 10) % 5;

            arr[i] = q + " " + d + " " + n + " " + p;
        }

        for (int i = 0; i < T; i++) {
            System.out.println(arr[i]);
        }
    }
}