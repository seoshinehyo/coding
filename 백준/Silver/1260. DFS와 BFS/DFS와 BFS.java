import java.util.*;

public class Main {
    static boolean visited[]; // 방문 배열
    static ArrayList<Integer>[] A; // 그래프 데이터 저장 인접 리스트

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); // 노드 개수
        int M = in.nextInt(); // 엣지 개수
        int Start = in.nextInt(); // 시작점
        A = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            A[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) { // A 인접 리스트에 그래프 데이터 저장
            int S = in.nextInt();
            int E = in.nextInt();
            A[S].add(E);
            A[E].add(S);
        }

        for (int i = 1; i <= N; i++) { // 오름차순 정렬
            Collections.sort(A[i]);
        }

        visited = new boolean[N + 1];
        DFS(Start);
        System.out.println();
        visited = new boolean[N + 1];
        BFS(Start);
        System.out.println();
    }

    public static void DFS(int Node) { // DFS - 재귀 함수 형태
        System.out.print(Node + " ");
        visited[Node] = true;
        for (Integer i : A[Node]) {
            if (!visited[i]) { // 방문하지 않은 노드로 호출
                DFS(i);
            }
        }
    }

    public static void BFS(int Node) { // BFS - 큐 형태
        Queue<Integer> queue = new LinkedList<>();
        queue.add(Node);
        visited[Node] = true;

        while (!queue.isEmpty()) {
            int now_Node = queue.poll(); // 큐에서 빼온 게 현재 노드
            System.out.print(now_Node + " ");
            for (Integer i : A[now_Node]) {
                if (!visited[i]) { // 방문하지 않은 노드면(!false)
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }
}
