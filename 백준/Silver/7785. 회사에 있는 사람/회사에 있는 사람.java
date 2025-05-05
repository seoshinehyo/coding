import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        Set<String> set = new TreeSet<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String event = st.nextToken();

            if ("enter".equals(event)) {
                set.add(name);
            } else {
                set.remove(name);
            }
        }

        for (String name : set) {
            System.out.println(name);
        }

        br.close();
    }
}