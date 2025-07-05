import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        float sum1 = 0;
        float sum2 = 0;
        int count = 20;
        
        for (int i = 0; i < count; i++) {
            String s = sc.next();
            float score = sc.nextFloat();
            String c = sc.next();

            if (c.equals("A+")) {
                sum1 += score * 4.5;
            } else if (c.equals("A0")) {
                sum1 += score * 4;
            } else if (c.equals("B+")) {
                sum1 += score * 3.5;
            } else if (c.equals("B0")) {
                sum1 += score * 3;
            } else if (c.equals("C+")) {
                sum1 += score * 2.5;
            } else if (c.equals("C0")) {
                sum1 += score * 2;
            } else if (c.equals("D+")) {
                sum1 += score * 1.5;
            } else if (c.equals("D0")) {
                sum1 += score * 1.0;
            } else if (c.equals("F")) {
                sum1 += score * 0;
            } else {
                continue;
            }

            if (c.equals("P")) {
                continue;
            }
            sum2 += score;
        }

        System.out.printf("%.6f", sum1/sum2);
    }
}