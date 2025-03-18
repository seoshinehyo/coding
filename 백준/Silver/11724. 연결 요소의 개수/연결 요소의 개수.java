import java.util.*;
import java.io.*;

public class Main {
    static boolean visited[]; // 방문 배열
    static ArrayList<Integer>[] A; // 그래프 데이터 저장 인접 리스트

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        A = new ArrayList[n + 1];
        visited = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            A[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) { // A 인접 리스트에 그래프 데이터 저장 - 양방향 그래프이므로 양쪽에 엣지 더하기
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            A[s].add(e);
            A[e].add(s);
        }

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                count++;
                DFS(i);
            }
        }
        System.out.println(count);
    }

    public static void DFS(int Node) { // DFS - 재귀 함수 형태
        if (visited[Node]) {
            return;
        }
        visited[Node] = true;
        for (Integer i : A[Node]) {
            if (!visited[i]) { // 방문하지 않은 노드로 호출
                DFS(i);
            }
        }
    }
}
