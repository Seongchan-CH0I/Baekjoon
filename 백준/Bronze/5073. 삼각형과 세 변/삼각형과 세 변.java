import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> sarr = new ArrayList<>();

        outloop:
        while (true) {
            int x = 0;        
            int max = 0;
            int count = 0;
            int sum = 0;        
            int[] arr = new int[3];
            for (int i = 0; i < 3; i++) {
                arr[i] = sc.nextInt();
                if(arr[i] == 0) {
                    count++;
                    if (count == 3) break outloop;
                }
                sum += arr[i];

                if (arr[i] > max) {
                    max = arr[i];
                }

                
                for (int j = 0; j <i; j++) {
                    if (arr[j] == arr[i]) {
                        x++;
                    }
                }
            }
            
            

            if (max < (sum - max)){
                    if (x == 0) {sarr.add("Scalene");} 
                    else if (x == 1) {sarr.add("Isosceles");} 
                    else {sarr.add("Equilateral");}
                } else {
                sarr.add("Invalid");
            }
        }

        for (int i = 0; i < sarr.size(); i++) {
            System.out.println(sarr.get(i));
        }
    }
}