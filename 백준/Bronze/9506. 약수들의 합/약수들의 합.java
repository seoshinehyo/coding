import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n;
        while ((n = Integer.parseInt(br.readLine())) != -1) {
            List<Integer> list = new ArrayList<>();
            for (int i = 1; i * i <= n; i++) {
                if (n % i == 0) {
                    list.add(i);
                    if (n / i != i) {
                        list.add(n / i);
                    }
                }
            }
            Collections.sort(list);
            int add = 0;
            for (int i = 0; i < list.size() - 1; i++) {
                add += list.get(i);
            }
            if (n != add) {
                bw.write(n + " is NOT perfect." + "\n");
                continue;
            }
            bw.write(n + " = ");
            for(int i = 0; i < list.size() - 1; i++) {
                bw.write(list.get(i) + ((i != list.size() - 2) ? " + " : "\n"));
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}