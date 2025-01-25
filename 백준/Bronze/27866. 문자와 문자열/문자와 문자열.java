import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        char[] arr = str.toCharArray();
        System.out.println(arr[n - 1]);
    }
}