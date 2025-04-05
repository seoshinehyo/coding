import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[10001]; // N이 10,000보다 작거나 같다고 했으므로 인덱스가 0부터이므로 10001까지

        for(int i = 0; i < N; i++){
            A[Integer.parseInt(br.readLine())]++; // 해당 입력받은 값을 인덱스로 갖는 요소의 값을 증가시킴
        }
        br.close();

        for (int i = 0; i < A.length; i++) {
            while (A[i]-- > 0) {
                bw.write(i + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}