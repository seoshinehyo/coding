import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        long[] A = new long[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            A[i] = Long.parseLong(st.nextToken());
        }
        Arrays.sort(A);
        int count = 0;
        for (int k = 0; k < n; k++) {
            int i = 0;
            int j = n - 1;
            while(i < j) {
                if (A[i] + A[j] == A[k]) {
                    if (i != k && j != k) {
                        count++;
                        break;
                    } else if (i == k) {
                        i++;
                    } else {
                        j--;
                    }
                } else if (A[i] + A[j] < A[k]) {
                    i++;
                } else {
                    j--;
                }
            }
        }
        System.out.println(count);
        br.close();
    }
}