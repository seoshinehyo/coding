import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        // 계산 결과를 보니 nCr 로 계산됨 - r은 항상 3
        
        System.out.println(n * (n - 1) * (n - 2) / 6);
        System.out.println(3);
    }
}