import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int S[] = new int[n + 1];
        S[0] = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            S[i] = S[i - 1] + Integer.parseInt(st.nextToken());
        }
        for (int k = 0; k < m; k++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            bw.write((S[j] - S[i - 1]) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}