import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 1;
        int minus = 6;
        if (N == 1) {
            System.out.print(1);
            return;
        }
        N -= 1;
        while (N > 0) {
            N -= minus;
            count++;
            minus += 6;
        }
        System.out.print(count);
    }
}