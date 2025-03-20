import java.util.*;
import java.io.*;

public class Main {
    static boolean[] visited; // 방문 배열
    static ArrayList<Integer>[] A;
    static boolean arrive;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();      // 노드 개수
        int M = in.nextInt();      // 엣지 개수
        arrive = false;
        A = new ArrayList[N];
        visited = new boolean[N];
        for (int i = 0; i < N; i++) {
            A[i] = new ArrayList<>();
        }
        for (int i = 0; i < M; i++) {
            int S = in.nextInt();
            int E = in.nextInt();
            A[S].add(E);
            A[E].add(S);
        }
        for (int i = 0; i < N; i++) {
            DFS(i, 1);
            if (arrive) {
                break;
            }
        }
        if (arrive) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }

    }

    public static void DFS(int now, int depth) {
        if (depth == 5 || arrive) {
            arrive = true;
            return;
        }
        visited[now] = true;
        for (Integer i : A[now]) {
            if (!visited[i]) {
                DFS(i, depth + 1);
            }
        }
        visited[now] = false;
    }
}
