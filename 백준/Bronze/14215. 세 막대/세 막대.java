import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
            if (max < arr[i]) {
                max = arr[i];
            }   
        }
        sum = sum - max;

        if (sum > max) {
            System.out.print(sum + max);
        } else {
            max = sum - 1;
            System.out.print(sum + max);
        }
    }
}