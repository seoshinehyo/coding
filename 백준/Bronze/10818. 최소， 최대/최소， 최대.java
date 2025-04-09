import java.util.*;
 
public class Main {
	public static void main(String[] args) {
    
		Scanner in = new Scanner(System.in);
        
		int N = in.nextInt();
		int[] A = new int[N];
        
		for (int i = 0; i < N; i++) {
			A[i] = in.nextInt();
		}
		Arrays.sort(A);
		System.out.print(A[0] + " " + A[N - 1]);
	}
}