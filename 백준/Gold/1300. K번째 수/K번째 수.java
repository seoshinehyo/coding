import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int k = in.nextInt();
        long start = 1;
        long end = k;
        long answer = 0;

        while (start <= end) {
            long mid = (start + end) / 2;
            int count = 0;
            // 중앙값보다 작은 수 몇 개인지 계산
            for (int i = 1; i <= N; i++) {
                count += (int) Math.min(mid / i, N);  // 작은 수 카운트
            }
            if (count < k) {
                start = mid + 1;
            } else {
                answer = mid;
                end = mid - 1;
            }
        }
        System.out.println(answer);
    }
}