package demo.dfs;

import java.util.Scanner;

/**
 * chap. DFS
 * sec. recursion
 */
public class DFS_Recursion {
    static final int MAX_N = 10;
    // 노드: N, 간선: E
    static int N, E;
    static int[][] Graph = new int[MAX_N][MAX_N];
    static boolean[] Visited = new boolean[MAX_N];


    // N.B. : DFS 구현
    static void dfs(int node) {
        Visited[node] = true;
        System.out.printf(node + " ");
        for (int next = 0; next < N; ++next) {
            if (!Visited[next] && Graph[node][next] != 0)
                dfs(next);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int E = sc.nextInt();

        for (int i = 0; i < E; ++i) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            Graph[u][v] = Graph[v][u] = 1;
        }
        dfs(0);
    }


}
