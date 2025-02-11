import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());
        int sum = 0;
        int d = 1;
        char[] c = N.toCharArray();
        for (int i = c.length - 1; i >= 0; i--) {
            if (c[i] >= 'A' && c[i] <= 'Z') {
                sum += (c[i] - 65 + 10) * d;
            } else {
                sum += (c[i] - 48) * d;
            }
            d *= B;
        }
        System.out.print(sum);
    }
}