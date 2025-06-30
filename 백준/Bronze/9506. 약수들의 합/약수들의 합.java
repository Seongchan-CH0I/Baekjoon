import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arr1 = new ArrayList<>();
        while (true) {
            int a = sc.nextInt();
            if (a == -1) {
                break;
            } else {
                arr1.add(a);
            }
        }

        int i = 0;
        
        while (i < arr1.size()) {
            int sum = 0;
            ArrayList<Integer> arr2 = new ArrayList<>();
            arr2.add(arr1.get(i));
            for (int j = 1; j < arr2.get(0); j++) {
                if (arr2.get(0)%j == 0) {
                    arr2.add(j);
                    sum += j;
                }
            }
            
            if (arr2.get(0) == sum) {
                System.out.print(arr2.get(0) + " = ");
                for (int k = 1; k <arr2.size() - 1; k++) {
                    System.out.print(arr2.get(k) + " + ");
                }
                System.out.println(arr2.get(arr2.size()-1));
            } else {
                System.out.println(arr2.get(0) + " is NOT perfect.");
            }

            i++;
        }
        
        
    }
}