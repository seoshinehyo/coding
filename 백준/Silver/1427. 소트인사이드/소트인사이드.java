import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int N = str.length();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(str.substring(i, i + 1));
        }
        for (int i = 0; i < N; i++) {
            int min = A[i];
            int index = 0;
            for (int j = i + 1; j < N; j++) {
                if (A[j] < min) {
                    min = A[j];
                    index = j;
                }
            }
            if (A[i] > min) {
                int tmp = A[i];
                A[i] = min;
                A[index] = tmp;
            }
        }
        for (int i = N - 1; i >= 0; i--) {
            System.out.print(A[i]);
        }
    }
}