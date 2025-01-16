import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }
        int sum = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (max < scores[i]) {
                max = scores[i];
            }
            sum += scores[i];
        }
        System.out.println(sum * 100.0 / max / n);
    }
}