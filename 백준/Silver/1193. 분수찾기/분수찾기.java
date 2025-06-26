import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int n = 0;
        while ( n*(n+1)/2 < X ) {
            n++ ;
        }

        int k = X - (n-1)*n/2;

        if ( n%2 == 0 ) {
            System.out.print(k + "/" + (n-k+1));
        } else {
            System.out.print((n-k+1) + "/" + k);
        }

    }
}