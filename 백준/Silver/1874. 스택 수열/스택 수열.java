import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        int nextPush = 1;  // 오름차순 수
        boolean isPossible = true;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());

            while (nextPush <= num) {
                stack.push(nextPush++);
                sb.append("+\n");
            }

            if (!stack.isEmpty() && stack.peek() == num) {
                stack.pop();
                sb.append("-\n");
            } else {
                isPossible = false;
                break;  // 불가능한 경우 즉시 종료
            }
        }

        if (isPossible)
            System.out.println(sb);
        else
            System.out.println("NO");
    }
}
