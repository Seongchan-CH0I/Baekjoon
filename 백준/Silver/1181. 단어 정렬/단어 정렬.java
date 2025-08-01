import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            set.add(s);
        }

        ArrayList<String> list = new ArrayList<>(set);
        list.sort((s1,s2) -> {
            if (s1.length() != s2.length()) {
                return s1.length() - s2.length();
            }
            return s1.compareTo(s2);
        });

        for (int i = 0; i < list.size(); i++) {
            bw.write(list.get(i) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}