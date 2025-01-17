import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 1. n(수의 개수), m(나누기 할 수) 입력받기
        int n = Integer.parseInt(st.nextToken());   // 수의 개수
        int m = Integer.parseInt(st.nextToken());   // 나누기 할 수
        long answer = 0;                            // m으로 나누어 떨어지는 (i,j) 쌍의 개수
        long[] S = new long[n + 1];                 // 합 배열
        long[] C = new long[m];                     // 같은 나머지의 인덱스를 카운트하는 배열

        // 2. n개의 수 입력 받으면서 누적 합을 m으로 나눈 나머지를 배열 S에 저장한다.
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            S[i] = (S[i - 1] + Integer.parseInt(st.nextToken())) % m;
            // 0~i까지의 합을 m으로 나눈 나머지가 0인 경우의 수 카운팅
            if(S[i] == 0) {
                answer++;
            }
            // 나머지가 같은 인덱스의 수 카운팅
            C[(int) S[i]]++;
        }

        // 3. S[j] % m == S[i-1] % m 을 만족하는 (i,j)의 수를 결과값에 더한다.
        // 즉, C[i](i가 나머지인 인덱스의 수)에서 2가지를 뽑는 경우의 수를 카운팅한다.
        for(int i = 0; i < m; i++) {
            if(C[i] > 1) {
                answer += (C[i] * (C[i]-1) / 2);
            }
        }
        System.out.println(answer);
    }
}