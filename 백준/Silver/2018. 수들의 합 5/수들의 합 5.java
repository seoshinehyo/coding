import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int start_index = 1;
        int end_index = 1;
        int sum = 1;
        int count = 1;

        while (end_index != n){
            // 투 포인터
            if (sum > n) {
                sum -= start_index;
                start_index++;
            } else if (sum < n){
                end_index++;
                sum += end_index;
            } else {
                end_index++;
                sum += end_index;
                count++;
            }
        }
        System.out.println(count);
    }
}