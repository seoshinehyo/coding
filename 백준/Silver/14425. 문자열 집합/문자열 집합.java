import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Set<String> array = new HashSet<>();

        for(int i = 0; i < N; i++) {
            array.add(br.readLine());
        }
        
        int count = 0;
        
        for(int i = 0; i < M; i++) {
            String str = br.readLine();

            if(array.contains(str)) {
                count++;
            }
        }
        br.close();
        
        System.out.println(count);
    }
}