package back_joon.n2667;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main3 {
    static int[][] graph;
    static boolean[][] visited;

    // 단지별로 몇 번 방문했는지 체크해야함
    static int countPer;

    // 4방탐색 해야함
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void dfs(int x, int y) {
        //방문했으니까 count 늘리고, visit체크해줘야 함
        countPer++;
        visited[x][y] = true;

        //x,y 좌표를 가지고 4방탐색 해줘야 함 -> 1로 연결되어 있으면? 다시 DFS. if 4방탐색 없으면? 종료해야하는데 근데 4방탐색이 없고 다른 단지 1을 찾아야 하니까 메인으로 돌아가야 함
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (graph[nx][ny] == 1 && !visited[nx][ny]) {
                dfs(nx, ny);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        //graph, visited 초기화
        graph = new int[n + 1][n + 1];
        visited = new boolean[n + 1][n + 1];

        //graph 에 저장
        for (int i = 1; i <= n; i++) {
            String num = br.readLine();
            for (int j = 0; j <= n; j++) {
                graph[i][j] = num.charAt(j - 1);
            }
        }

        // (1,1) ~ (N,N) 순회하면서 DFS 수행. 방문 수 체크할 ArrayList 필요
        // ref. 연결되어있는지 확인?
        ArrayList<Integer> countList = new ArrayList<>();

        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph.length; j++) {

                countPer = 0;

                if (graph[i][j] == 1 && !visited[i][j]) {
                    dfs(i, j);
                    countList.add(countPer);
                }
            }
        }


    }
}
