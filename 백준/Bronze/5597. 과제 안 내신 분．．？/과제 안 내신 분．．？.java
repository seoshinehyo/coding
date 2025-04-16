import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] A = new int[31];
		
		for (int i = 1; i < 29; i++) {
			int success = in.nextInt();
			A[success] = 1;
		}
		for (int i = 1; i < A.length; i++) {
			if (A[i] != 1) {
                System.out.println(i);
            }
		}
	}

}