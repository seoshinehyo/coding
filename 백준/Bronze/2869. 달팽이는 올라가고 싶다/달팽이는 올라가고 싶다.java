import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        // 마지막 날을 제외한 거리
        int exceptDistance = V - A;

        // 하루에 올라가는 순수 거리
        int pureDistance = A - B;

        int day = 0;
        if (exceptDistance > 0) {
            day = (exceptDistance + pureDistance - 1) / pureDistance;
        }
        System.out.println(day + 1);
    }
}