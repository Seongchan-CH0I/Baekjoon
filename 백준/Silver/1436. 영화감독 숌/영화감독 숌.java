import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        int N = sc.nextInt();

        arr.add(666);
        int b = 0;
        int count = 10;

        for (int i = 1; i< N; i++) {
            int c = 0;
            b++;
            if (b % 10 == 6) {
                if (b % 100 == 66) {
                    if (b % 1000 == 666) {
                        if (b % 10000 == 6660) {
                            while (c < 10000) {
                                arr.add(b*1000 +c);
                                c++;
                            }
                        }
                        while (c < 1000) {
                            arr.add(b*1000 + c);
                            c++;
                        }
                    }
                    while (c < 100) {
                        arr.add(b*1000 + 600 + c);
                        c++;
                    }
                }
                while (c < 10) {
                    arr.add(b*1000 + 660 + c);
                    c++;
                }
            } 
            
            else {
                arr.add(b*1000 + 666);
            } 

        }

        System.out.print(arr.get(N-1));
        

    }
}