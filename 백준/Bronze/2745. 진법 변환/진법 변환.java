import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String N = sc.next();

        int B = sc.nextInt();

        int[] arr = new int[N.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = N.charAt(i);
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 58) {
                arr[i] = arr[i] - 48;
            } else {
                arr[i] = arr[i] - 55;
            }
        }

        int sum = 0;
        int sq = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.pow(B,sq) * arr[i];
            sum += arr[i];
            sq--;
        }

        System.out.print(sum);

    }
}
