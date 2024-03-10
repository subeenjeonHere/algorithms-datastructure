package baek_joon.class_3.DFS와BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class DFS와BFS {
    //방문 배열
    private static boolean[] visited;
    //dfs 인접 리스트
    private static ArrayList<Integer>[] list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        // 노드 개수
        int N = Integer.parseInt(arr[0]);
        //간선
        int M = Integer.parseInt(arr[1]);
        // Start
        int start = Integer.parseInt(arr[2]);

        //dfs 자료구조 할당
        list = new ArrayList[N + 1];
        visited = new boolean[N + 1];

        /**
         * @Point 그래프 인접리스트
         * 1 ㅣ -> 2 -> 3 -> 4
         * 2 ㅣ -> 4
         * 3 ㅣ-> 4
         */
        // 1부터
        for (int i = 1; i <= N; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
            int from = Integer.parseInt(stk.nextToken());
            int to = Integer.parseInt(stk.nextToken());
            System.out.println();
            System.out.println(from + "  ->  " + to);
            list[from].add(to);
            list[to].add(from);
        }
        // 1 Node부터 엣지 정렬
        for (int i = 1; i < N; i++) {
            Collections.sort(list[i]);
        }
        //시작 정점 bfs, dfs 순회 시작
        dfs(start);
        System.out.println();
        /**
         * @Point
         * visited 방문 배열 초기화 해줘야 함
         */
        visited = new boolean[N + 1];
        bfs(start);
    }

    private static void bfs(int N) {
        //bfs는 큐로 구현
        Queue<Integer> que = new LinkedList<>();

        //큐에 현재 노드 삽입
        que.add(N);
        visited[N] = true;

        // 큐 빌 때까지
        while (!que.isEmpty()) {
            /**
             * @Point 현재 노드 큐에서 poll 해야함
             */
            int nowNode = que.poll();
            System.out.print(nowNode + " ");
            for (int ele : list[N]) {
                if (!visited[ele]) {
                    visited[ele] = true;
                    que.add(ele);
                }
            }

        }
    }

    private static void dfs(int N) {
        // 방문 체크
        visited[N] = true;
        // 방문한 노드 출력
        System.out.print(N + " ");
        //dfs 순회 연결된 정점
        //현재 노드에서 연결된 노드들을 방문해야 함
        for (int n : list[N]) {
            if (!visited[n]) {
                dfs(n);
            }
        }
    }
}
