import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt() - 1 ;

        int limit = 0;
        int count = 1;
        while (N > limit) {
            limit += 6*count;
            count ++;
        }

        System.out.print(count);

    }
}