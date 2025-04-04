import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] A = new int[5];
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            A[i] = in.nextInt();
            sum += A[i];
        }
        Arrays.sort(A);
        System.out.println(sum / 5);
        System.out.println(A[2]);
    }
}