import java.util.*;
import java.io.*;

public class Main {
    static int N;
    static int M;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        String[] A = new String[N];
        for (int i = 0; i < N; i++) {
            A[i] = br.readLine();
        }

        System.out.println(count(A));
        br.close();
    }

    public static int count(String[] A) {
        int result = Integer.MAX_VALUE;

        for (int i = 0; i < N - 7; i++) {
            for (int j = 0; j < M - 7; j++) {
                for (int k = 0; k < 2; k++) {
                    char start = k == 0 ? 'W' : 'B';

                    int count = 0;
                    for (int n = i; n < i + 8; n++) {
                        for (int m = j; m < j + 8; m++) {
                            if (start != A[n].charAt(m)) {
                                count++;
                            }
                            start = start == 'W' ? 'B' : 'W';
                        }
                        start = start == 'W' ? 'B' : 'W';
                    }
                    result = Math.min(result, count);
                    if (result == 0) {
                        return 0;
                    }
                }
            }
        }
        return result;
    }
}