import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();

        while (true) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);

            if (a == 0 && b == 0) {
                break;
            }

            if (b % a == 0) {
                list.add("factor");
            } else if (a % b == 0) {
                list.add("multiple");
            } else {
                list.add("neither");
            }
        }

        for (String l : list) {
            System.out.println(l);
        }
    }
}