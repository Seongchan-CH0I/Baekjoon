import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        if (arr[0] == arr[1]) {
            if (arr[1] == arr[2]) {
                System.out.print(10000 + arr[0]*1000);
            } else {
                System.out.print(1000 + arr[0]*100);
            }
        } else if (arr[0] == arr [2]) {
            System.out.print(1000 + arr[0]*100);
        } else if (arr[1] == arr[2]) {
            System.out.println(1000 + arr[1]*100);
        } else {
            System.out.print(max*100);
        }

    }
}