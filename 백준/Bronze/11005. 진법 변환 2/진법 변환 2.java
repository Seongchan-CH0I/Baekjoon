import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int B = sc.nextInt();

        ArrayList<Character> list = new ArrayList<>();

        while (N > 0) {
            int a = N % B;
            N = N / B;
            if ( a > 9 ) {
                char c = (char) ( a + 55 );
                list.add(c);
            } else {
                char c = (char) ( a + 48 );
                list.add(c);
            }
        }

        for (int i = list.size()-1; i >= 0; i--) {
            System.out.print(list.get(i));
        }
    }
}