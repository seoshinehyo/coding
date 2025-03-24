import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());

        // 저장 배열
        int[] A = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);

        // 검증할 배열
        int M = Integer.parseInt(br.readLine());
        int[] F = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            F[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < M; i++) {
            int find = F[i];
            int start = 0;
            int end = N - 1;
            boolean check = false;

            // start가 end보다 작거나 같은 동안 탐색
            while (start <= end) {
                int mid = (start + end) / 2;

                if (A[mid] == find) {
                    check = true;
                    break;
                } else if (A[mid] > find) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            
            if (check) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }

        br.close();
    }
}