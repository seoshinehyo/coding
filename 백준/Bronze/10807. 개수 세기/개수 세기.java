import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());;
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int b = Integer.parseInt(br.readLine());

        for(int i = 0; i < arr.length; i++){
            if(b == arr[i]) {
                count++;
            }
        }
        System.out.println(count);

        br.close();
        bw.flush();
        bw.close();
    }
}