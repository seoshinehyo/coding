import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i * i <= N; i++) {
            if (N % i == 0) {
                list.add(i);
                if (N / i != i) {
                    list.add(N / i);
                }
            }
        }
        Collections.sort(list);

        if (K <= list.size()) {
            System.out.print(list.get(K - 1));
        } else {
            System.out.print(0);
        }
    }
}