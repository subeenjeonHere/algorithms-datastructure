package baek_joon.class_3.유기농배추;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.Formattable;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @Subject BFS 풀이
 */

/**
 * @Point 왜 그래프 n+2, m+2로 해줘야 하는지
 */
public class Main_BFS {
    // 가로 m, 세로 n, 노드 k
    static int m, n, k;
    static int[][] graph;
    static boolean[][] visit;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //테케
        int tc = Integer.parseInt(br.readLine());
        //가로길이, 세로길이, 노드
        for (int i = 1; i <= tc; i++) {

            String[] info = br.readLine().split(" ");
            m = Integer.parseInt(info[0]);
            n = Integer.parseInt(info[1]);
            k = Integer.parseInt(info[2]);

            // 인접 행렬 할당
            graph = new int[n + 2][m + 2];
            visit = new boolean[n + 2][m + 2];
            for (int p = 0; p < graph.length; p++) {
                for (int q = 0; q < graph[p].length; q++) {
                    String[] ab = br.readLine().split(" ");
                    int x = Integer.parseInt(ab[0]);
                    int y = Integer.parseInt(ab[1]);
                    graph[x][y] = 1;
                }
            }
            for (int x = 0; x < graph.length; x++) {
                for (int y = 0; y < graph[y].length; y++) {
                    if (graph[x][y] == 1 && !visit[x][y]) {
                        bfs(x, y, visit, graph);
                    }
                }
            }

        }

    }

    //BFS 시작
    private static void bfs(int x, int y, boolean[][] visit, int[][] graph) {
        //델타 4방 탐색
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        int[][] dir = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

        Queue<Integer> que = new LinkedList<>();

        //큐 선언
        Queue<pair> queue = new LinkedList<>();

        //큐에 시작노드 삽입
        que.add(graph[x][y]);

        //시작노드 삽입
        queue.add(new pair(x, y));

        //방문 체크
        visit[x][y] = true;

        // 큐 빌 때까지 반복
        while (queue.size() > 0) {
            pair p = queue.peek();
            queue.remove();

            // 방문체크
            visit[p.node1][p.node2] = false;

            //4방탐색
            for (int d = 0; d < 4; d++) {
                //4방 탐색 좌표
                int a = p.node1 + dir[d][0];
                int b = p.node2 + dir[d][1];

                if (a >= 0 && b >= 0 && a < n && b < m && !visit[a][b]) {
                    queue.add(new pair(a, b));
                }


            }

        }

        while (!que.isEmpty()) {
            //현재 노드에서 연결된 노드 4방 탐색
            for (int d = 0; d < 4; d++) {
                int nx = x + dx[d];
                int ny = y + dy[d];

                if (nx < 0 || ny < 0)
                    if (graph[nx][ny] == 1 && !visit[nx][ny]) {
                        visit[nx][ny] = true;
                        que.add(graph[nx][ny]);
                    }
            }

        }

        //4방 탐색
        //큐에 시작노드 삽입
        //노드 방문 체크
        //반복

    }


    static class pair {
        int node1, node2;

        pair(int f, int s) {
            node1 = f;
            node2 = s;
        }
    }
}
