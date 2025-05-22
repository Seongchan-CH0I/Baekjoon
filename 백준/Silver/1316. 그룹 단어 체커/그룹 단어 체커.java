import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int count = N;



        for(int i = 0; i < N; i++) {
            String str = sc.next();
            char pre = 0;
            boolean[] arr = new boolean[26];
            
            for(int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if (pre != c){
                    if (!arr[c-'a']) {
                        arr[c-'a'] = true;
                    } else {
                        count --;
                        break;
                    }
                }
                pre = c;
            }
        }

        System.out.print(count);
    }
}