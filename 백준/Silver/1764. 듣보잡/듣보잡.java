import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Map<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            map.put(str, 1);
        }

        for (int i = 0; i < M; i++) {
            String str = br.readLine();
            map.put(str, map.getOrDefault(str, 0) + 1);
            if (map.get(str) == 2) {
                list.add(str);
            }
        }
        Collections.sort(list);
        sb.append(list.size()).append("\n");
        for (String str : list) {
            sb.append(str).append("\n");
        }
        System.out.print(sb);
    }
}