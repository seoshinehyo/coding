import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] arr = str.toCharArray();
        int n = 26;
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int index = (int) arr[i] - 97;
            if (A[index] == -1) {
                A[index] = i;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
    }
}