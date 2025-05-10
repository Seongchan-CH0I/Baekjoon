import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int[] ar = new int[N];
        for(int i=0; i<N; i++) {
            ar[i] = i+1; 
        }
        
        for(int k=0; k<M; k++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            
            i -= 1;
            j -= 1;
            
            int c = ar[i];
            ar[i] = ar[j];
            ar[j] = c;
        }
        
        for(int i=0; i<ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
    }
}