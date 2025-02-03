import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] A = new char[5][15];
        int max = 0;
        for (int i = 0; i < 5; i++) {
            String str = br.readLine();
            if (str.length() > max) {
                max = str.length();
            }
            for (int j = 0; j < str.length(); j++) {
                A[i][j] = str.charAt(j);
            }
            for (int j = str.length(); j < 15; j++) {
                A[i][j] = ' ';
            }
        }
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < 5; j++) {
                if (A[j][i] == ' ') {
                    continue;
                }
                System.out.print(A[j][i]);
            }
        }
    }
}