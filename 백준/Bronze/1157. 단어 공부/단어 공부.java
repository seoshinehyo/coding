import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toUpperCase();
        int[] A = new int[26];
        for (int i = 0; i < A.length; i++) {
            A[i] = 0;
        }
        for (int i = 0; i < str.length(); i++) {
            int index = str.charAt(i) - 65;
            A[index]++;
        }
        int max = 0;
        char c = '?';
        for (int i = 0; i < A.length; i++) {
            if (A[i] > max) {
                max = A[i];
                c = (char) (i + 65);
            } else if (A[i] == max) {
                c = '?';
            }
        }
        System.out.print(c);
    }
}