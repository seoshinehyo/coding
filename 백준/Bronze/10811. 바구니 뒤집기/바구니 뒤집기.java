import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int count = Integer.parseInt(st.nextToken()); 
		int temp = 0;
		int A[] = new int[n];
        
		for (int i = 0; i < A.length; i++) {
			A[i] = i + 1;
		}
		
		for (int i = 0; i < count; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()) - 1;
			int b = Integer.parseInt(st.nextToken()) - 1;
			
			while (a < b) {
				temp = A[a];
				A[a] = A[b];
				A[b] = temp;
				a++;
				b--;
			}
		}
		
		br.close();
		
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}
		
	}
}