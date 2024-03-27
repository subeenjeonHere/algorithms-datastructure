package baek_joon.그래프.트리의부모찾기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

/**
 * @Point DFS 순회
 * 인덱스에 부모노드를 기록 순서대로 출력
 * 연결 여부 확인 하므로 연결 리스트 사용
 * 깊이우선 탐색으로 부모 노드 > 자식 노드 끝까지 순회 위해 DFS 사용
 */
public class Main {
    //연결리스트
    static ArrayList<ArrayList<Integer>> g;
    //노드 정점 개수 n
    static int n;
    //간선 정보 n -1개
    static int edge;
    //방문배열
    static boolean[] visit;
    //부모노드 기록배열
    static int[] parent;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        g = new ArrayList<>();
        n = Integer.parseInt(br.readLine());
        edge = n - 1;

        //간선 개수 만큼 initialization
        for (int i = 0; i <= n; i++) {
            g.add(i, new ArrayList<>());
        }
        //Connect edge
        for (int i = 0; i < edge; i++) {
            String[] ab = br.readLine().split(" ");
            int a = Integer.parseInt(ab[0]);
            int b = Integer.parseInt(ab[1]);
            //Connect vertex
            g.get(a).add(b);
            g.get(b).add(a);
        }

        visit = new boolean[n + 1];
        parent = new int[n + 1];
        dfs(1);
        StringBuilder sb = new StringBuilder();
        for (int i = 2; i < parent.length; i++) {
            sb.append(parent[i]).append("\n");
        }
        System.out.println(sb.toString().trim());
    }

    private static void dfs(int node) {
        Stack<Integer> stk = new Stack<>();

        visit[node] = true;

        stk.push(node);
        while (!stk.isEmpty()) {
            int nowNode = stk.pop();
            for (int v : g.get(nowNode)) {
                if (!visit[v]) {
                    visit[v] = true;
                    parent[v] = nowNode;
                    dfs(v);
                }
            }
        }
    }

}
