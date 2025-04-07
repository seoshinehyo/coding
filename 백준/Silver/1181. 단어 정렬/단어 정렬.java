import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] A = new String[N];
        for (int i = 0; i < N; i++) {
            A[i] = br.readLine();
        }

        Arrays.sort(A, (str1, str2) -> {
            if (str1.length() == str2.length()) {
                return str1.compareTo(str2);
            }
            else {
                return str1.length() - str2.length();
            }
        });

        StringBuilder sb = new StringBuilder();
        sb.append(A[0]).append('\n');
        for (int i = 1; i < N; i++) {
            if (!A[i].equals(A[i - 1])) {
                sb.append(A[i]).append('\n');
            }
        }
        System.out.println(sb);
    }
}