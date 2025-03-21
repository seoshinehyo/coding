import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        // MenOfPassion 알고리즘 보니까 n*(n - 1)/2 로 계산됨
        long sum = 0;
        for (int i = 1; i < n; i++) {
            sum += i;
        }
        System.out.println(sum);
        System.out.println(2);
    }
}