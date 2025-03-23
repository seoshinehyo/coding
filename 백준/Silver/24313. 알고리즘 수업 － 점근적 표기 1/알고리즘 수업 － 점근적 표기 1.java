import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a1 = Integer.parseInt(st.nextToken());
        int a0 = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());

        boolean check = false;
        if (a1 < c) {
            check = (a1 * n0 + a0 <= c * n0);
        } else if (a1 == c) {
            check = (a0 <= 0);
        }
        
        System.out.print(check ? 1 : 0);
        
        br.close();
    }
}