import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int a = 2;
        for (int i = 0; i < N; i++) {
            a += a - 1;
        }
        System.out.print(a * a);
    }
}