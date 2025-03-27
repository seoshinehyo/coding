import java.util.*;
import java.io.*;

public class Main {

    static boolean[] visited;  // 방문 기록 저장
    static int[] distance;  // 엣지 거리 저장
    static ArrayList<Edge>[] A;  // 인접 리스트 저장 리스트 - 가중치가 있으면 Edge라는 내장 클래스 사용

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());  // 노드 개수 N
        A = new ArrayList[N + 1];

        for (int i = 1; i <= N; i++) {
            A[i] = new ArrayList<>();  // 인접 리스트 A 초기화
        }
        for (int i = 0; i < N; i++) {  // 인접 리스트 A에 클래스 형태로 그래프 데이터 저장
            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());  // 노드 S
            while (true) {
                int E = Integer.parseInt(st.nextToken());  // 노드 E 인데 -1 이면 노드가 아닌 종료
                if (E == -1) {
                    break;
                }
                int V = Integer.parseInt(st.nextToken());  // 엣지 가중치 V
                A[S].add(new Edge(E, V));  // S 노드에 대한 인접 리스트 저장
            }
        }

        distance = new int[N + 1];
        visited = new boolean[N + 1];
        BFS(1);  // 임의의 노드 하나 정해서 BFS 돌리기
        int max = 1;
        for (int i = 2; i <= N; i++) {  // 엣지 거리 중 가장 큰 값으로 시작점 설정
            if (distance[max] < distance[i]) {
                max = i;
            }
        }
        distance = new int[N + 1];
        visited = new boolean[N + 1];
        BFS(max);  // 임의의 노드와 가장 먼 노드부터 BFS 수행
        Arrays.sort(distance);
        System.out.println(distance[N]);  // 가장 큰 값을 지름으로 출력
    }

    public static void BFS(int index) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(index);
        visited[index] = true;
        while (!queue.isEmpty()) {
            int nowNode = queue.poll();
            for (Edge edge : A[nowNode]) {
                int e = edge.e;
                int v = edge.value;
                if (!visited[e]) {
                    visited[e] = true;
                    queue.add(e);
                    distance[e] = distance[nowNode] + v;  // 거리 배열 업데이트 - 현재 노드 길이 + 엣지 길이
                }
            }
        }
    }

    static class Edge {
        int e;
        int value;
        public Edge(int e, int value) {
            this.e = e;
            this.value = value;
        }
    }
}