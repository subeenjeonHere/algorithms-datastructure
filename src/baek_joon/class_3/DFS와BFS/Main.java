package baek_joon.class_3.DFS와BFS;

import java.util.*;

public class Main {
    static boolean[] visited;
    static ArrayList<Integer>[] A;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int start = sc.nextInt();
        A = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            A[i] = new ArrayList<>();
        }
        for (int i = 0; i < M; i++) {
            int S = sc.nextInt();
            int E = sc.nextInt();
            //엣지 연결
            A[S].add(E);
            A[E].add(S);
        }
        for (int i = 1; i < N; i++) {
            //엣지 정렬
            Collections.sort(A[i]);
        }
        visited = new boolean[N + 1];
        DFS(start);
        System.out.println();
        visited = new boolean[N + 1];
        BFS(start);
    }

    private static void BFS(int Node) {
        Queue<Integer> queue = new LinkedList<>();

        //큐에 시작노드 삽입
        queue.add(Node);
        //방문 기록
        visited[Node] = true;

        // 큐가 빌 때까지 loop
        while (!queue.isEmpty()) {

            //현재 노드 큐에서 Poll
            int now_Node = queue.poll();
            System.out.print(now_Node + " ");

            //현재 노드에서 갈 수 있는 노드 탐색 BFS
            for (int i : A[now_Node]) {
                //미방문 노드 찾아서 큐 삽입, 큐에 넣으며 방문 체크
                if (!visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }

    private static void DFS(int Node) {
        //방문했으니까 출력
        System.out.print(Node + " ");
        //방문 기록
        visited[Node] = true;

        // 현재 노드와 연결된 노드 탐색 > dfs
        // 이미 방문한 노드 아니라면 DFS 재귀 호출
        for (int i : A[Node]) {
            if (!visited[i]) {
                DFS(i);
            }
        }
    }
}
