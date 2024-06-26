package baek_joon.class_3.연결요소개수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * @Point - 연결요소의 개수
 * 인접리스트, DFS 사용
 * @Review - 엣지 케이스 고려
 * - 간선 0개일 때
 * - 간선 정보 주어지지 않았다고 노드가 없는 게 아님, 문제에서 Node는 무조건 1부터 시작한다는 걸 간과함
 */
public class Main {
    static ArrayList<ArrayList<Integer>> g;
    static boolean visit[];
    static int n, m;
    static int count;
    static int subNode;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //정점 N, 간선 M 입력
        String[] nm = br.readLine().split(" ");
        n = Integer.parseInt(nm[0]);
        m = Integer.parseInt(nm[1]);

        //인접 리스트 할당
        g = new ArrayList<>();

        //노드 개수 만큼 각 arraylist 초기화
        for (int i = 0; i <= n; i++) {
            g.add(i, new ArrayList<>());
        }

        //무방향 그래프 간선 연결, 간선 개수 m만큼 반복
        for (int i = 0; i < m; i++) {
            String[] ab = br.readLine().split(" ");
            int a = Integer.parseInt(ab[0]);
            int b = Integer.parseInt(ab[1]);
            g.get(a).add(b);
            g.get(b).add(a);
        }

        //출력
        print();
        //방문 배열 초기화
        visit = new boolean[n + 1];
        //카운트 초기화
        count = 0;

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < g.get(i).size(); j++) {
                int node = g.get(i).get(j);
                if (!visit[node]) {
                    dfs(g, node, visit);
                    count++;
                }
            }
        }

        // 연결되지 않은 컴포넌트, 엣지케이스로 간선 입력되지 않았을때도 고려해야 함
        // 이렇게 구현할거면 DFS 종료 후 방문 체크해야 함
        for (int i = 1; i <= n; i++) {
            if (!visit[i]) {
                subNode++;
            }
        }

        if (m == 0) {
            System.out.print(n);
        } else {
            System.out.print(count + subNode);
        }

    }

    //dfs
    private static void dfs(ArrayList<ArrayList<Integer>> g, int node, boolean[] visit) {

        //방문 체크
        visit[node] = true;
        //현재 노드와 연결된 모든 노드를 순회
        for (int v : g.get(node)) {
            if (!visit[v]) {
                dfs(g, v, visit);
            }
        }
    }

    private static void print() {
        for (ArrayList<Integer> subList : g) {
            System.out.println(subList);
        }
    }
}