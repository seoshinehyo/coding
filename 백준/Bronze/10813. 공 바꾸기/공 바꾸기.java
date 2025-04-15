import java.util.*;

public class Main {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int A[] = new int[N];
        int M = in.nextInt();
        int temp;

        for(int i = 0; i < A.length; i++) {
            A[i] = i + 1;
        }
        for(int j = 0; j < M; j++) {
            int I = in.nextInt();
            int J = in.nextInt();

            temp = A[I-1];
            A[I-1] = A[J-1];
            A[J-1] = temp;
        }
        for(int k = 0; k < A.length; k++) {
            System.out.print(A[k] + " ");
        }
    }
}