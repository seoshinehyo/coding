import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String A = st.nextToken();
        String B = st.nextToken();
        int rA = Integer.parseInt(new StringBuilder(A).reverse().toString());
        int rB = Integer.parseInt(new StringBuilder(B).reverse().toString());
        System.out.print((rA > rB) ? rA : rB);
        br.close();
    }
}
