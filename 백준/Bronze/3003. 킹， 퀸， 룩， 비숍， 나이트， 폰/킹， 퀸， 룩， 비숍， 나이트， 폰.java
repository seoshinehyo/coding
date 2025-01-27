import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 6;
        int[] A = new int[n];
        int[] answer = {1, 1, 2, 2, 2, 8};
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(answer[i] - A[i] + " ");
        }
    }
}