import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int count = 0;
        int c = 0;

        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            for (int j = 1; j <= a; j++) {
                if(a%j == 0) {
                    count++;
                }
            }
            
            if (count == 2) {
                c++;
            }

            count = 0;
        }

        System.out.print(c);
    }
}