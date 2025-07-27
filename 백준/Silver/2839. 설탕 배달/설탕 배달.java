import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int a = N/5;
            while (true) {
                if ((N - (a*5)) % 3 == 0) {
                    System.out.print(a + ((N - (a*5)) / 3));
                    return;
                }
                a--;
                    if (a <= 0) {
                        if (N % 3 == 0) {
                            System.out.print(N / 3);
                            return;
                        } else if (N % 5 == 0) {
                            System.out.print(N / 5);
                            return;
                        } else {
                            System.out.println("-1");
                            return;
                        }
                    }
                
            }
        }
    }