import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[][] A = new int[9][9];
        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int max = 0;
        int a = 0;
        int b = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (A[i][j] > max) {
                    max = A[i][j];
                    a = i;
                    b = j;
                }
            }
        }
        System.out.println(max);
        System.out.print((a + 1) + " " + (b + 1));
    }
}