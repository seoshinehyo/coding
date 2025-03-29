import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = 0;
        
        for(int i = 1; i <= N; i++) {
            int number = i;
            int sum = 0;
            
            while(number > 0){
                sum += number % 10;
                number /= 10;
            }

            if(sum + i == N){
                M = i;
                break;
            }
        }
        System.out.println(M);
    }
}