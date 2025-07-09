import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int count = 0;
        int sum = 0;
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
            for(int j = 0; j < i; j++) {
                if(arr[j] == arr[i]) {
                    count++;
                }
            }
        }
        if (sum == 180) {
        if (count == 3) {
            System.out.print("Equilateral");
        } else if (count == 1) {
            System.out.print("Isosceles");
        } else {
            System.out.print("Scalene");
        }
       } else {
            System.out.print("Error");
        }
    }
}