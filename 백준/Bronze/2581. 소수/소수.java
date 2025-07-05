import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        
        int sum = 0;
        int count = 0;
        if (M == 1) {
            M = 2;
        }
        for (int i = M; i<= N; i++) {
            for (int j = 2; j < i; j++) {
                if (i%j == 0) {
                    count++;
                }
            }
            if (count == 0) {
                sum += i;
                list.add(i);
            }
            count = 0;
        }

        if (sum == 0) {
            System.out.print("-1");
        } else {
        System.out.println(sum);
        System.out.print(list.get(0));
        }
    }
}
