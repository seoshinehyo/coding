import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        if (N == 1) {
            System.out.print("0");
            return;
        }
        int[] X = new int[N];
        int[] Y = new int[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            X[i] = Integer.parseInt(st.nextToken());
            Y[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(X);
        Arrays.sort(Y);
        System.out.print((X[N - 1] - X[0]) * (Y[N - 1] - Y[0]));
    }
}