import java.util.*;
import java.io.*;

public class Main {
    static int[] A, tmp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        A = new int[N + 1];
        tmp = new int[N + 1];

        for (int i = 1 ; i <= N ; i++) {
            A[i] = Integer.parseInt(br.readLine());
        }

        merge_sort(1, N);

        for (int i = 1;  i <= N ; i++) {
            bw.write(A[i] + "\n");
        }
        bw.flush();
        br.close();
    }

    public static void merge_sort(int s, int e) {
        if (e - s < 1) {
            return;
        }
        int mid = s + (e - s) / 2;

        merge_sort(s, mid);
        merge_sort(mid + 1, e);

        for (int i = s ; i <= e ; i++) {
            tmp[i] = A[i];
        }

        int L = s;
        int R = mid + 1;
        int index = s;

        while (L <= mid && R <= e) {
            if(tmp[L] < tmp[R]) {
                A[index] = tmp[L];
                index++;
                L++;
            }
            else {
                A[index] = tmp[R];
                index++;
                R++;
            }
        }

        while (L <= mid) {
            A[index] = tmp[L];
            index++;
            L++;
        }
        while (R <= e) {
            A[index] = tmp[R];
            index++;
            R++;
        }
    }
}