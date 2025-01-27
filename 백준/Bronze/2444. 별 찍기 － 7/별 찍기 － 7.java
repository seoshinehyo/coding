import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < N - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = N + 1; i <= 2 * N - 1; i++) {
            for (int j = 0; j < i - N; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * N - i) * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}