import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int count = 1;
        int num = 666;
        
        while (N != count) {
            num++;
            if (String.valueOf(num).contains("666")) {
                count++;
            }
        }
        System.out.println(num);
    }
}