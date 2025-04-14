import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] A = new int[N];
        int M = in.nextInt();

        for(int i = 0; i < M; i++) {
            int I = in.nextInt();
            int J = in.nextInt();
            int K = in.nextInt();

            for(int j = I - 1; j < J; j++) {
                A[j] = K;
            }
        }
        for(int k = 0; k < A.length; k++) {
            System.out.print(A[k] + " ");
        }
    }
}