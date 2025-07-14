import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] list = new int[N];
        for (int i = 0; i < list.length; i++) {
            list[i] = sc.nextInt();
        }

        int max = 0;
        for (int i = 0; i < list.length-2; i++) {
            for (int j = i+1; j < list.length-1; j++) {
                for (int k = j+1; k < list.length; k++) {
                    int A = list[i] + list [j] + list[k];
                    if (A <= M && A > max ) {
                        max = A;
                    }
                }
            }
        }

        System.out.print(max);
    }
}