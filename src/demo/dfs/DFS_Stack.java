package demo.dfs;

import java.util.Scanner;
import java.util.Stack;

/**
 * chap. DFS
 * sec. DFS_Stack
 */
public class DFS_Stack {

    static final int MAX_N = 10;

    // 노드, 간선
    static int N, E;
    static int[][] Graph = new int[MAX_N][MAX_N];
    static boolean[] Visited = new boolean[MAX_N];

    static void dfs(int node) {
        boolean[] Visited = new boolean[MAX_N];

        Stack<Integer> stk = new Stack<>();
        // 시작노드 push
        stk.push(node);

        while (!stk.empty()) {
            int curr = stk.pop();

            if (Visited[curr]) continue;

            Visited[curr] = true;
            System.out.printf(curr + " ");

            for (int next = 0; next < N; ++next) {
                if (!Visited[next] && Graph[curr][next] != 0) {
                    stk.push(next);
                }

            }

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
