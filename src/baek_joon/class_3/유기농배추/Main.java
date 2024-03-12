package baek_joon.class_3.유기농배추;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * @Point - 시작 노드 설정
 * - 4방 탐색
 * - 4방 탐색 결과 방문 체크 및 DFS 호출
 * - 4방 탐색하면서 1있으면 dfs 재귀호출 지속, 1 없다면 종료
 * - 상하 좌우로 탐색하기에 1이 여러 개 있다면 원래 노드로 복귀해야 함
 */
public class Main {
    static int n;
    static int[][] g;
    static boolean[] visited;
    //4방 탐색 델타 배열
    static int[] node;
    static int count;
    static int x, y;

    public static void main(String[] args) throws IOException {
        // 인접행렬 할당
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        String[] info = br.readLine().split(" ");
        int m = Integer.parseInt(info[0]);
        int n = Integer.parseInt(info[1]);
        int k = Integer.parseInt(info[2]);

        g = new int[m + 1][m + 1];

        //노드 저장
        node = new int[m + 1];
        // 인접 행렬 할당
        for (int i = 0; i < k; i++) {
            String[] ab = br.readLine().split(" ");
            int from = Integer.parseInt(ab[0]);
            int to = Integer.parseInt(ab[1]);
            g[from][to] = 1;
        }

        System.out.println("====");
        //인접 행렬 출력
        for (int i = 0; i < g.length; i++) {
            for (int j = 0; j < g[i].length; j++) {
                System.out.print(g[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("====");

        // 방문 배열 할당
        visited = new boolean[m + 1];

        //시작할 노드 찾기 (0,0)
        // 1이 있으면 dfs 호출
        for (int i = 0; i < g.length; i++) {
            for (int j = 0; j < g[i].length; j++) {
                if (g[i][j] == 1) {
                    dfs(i, j, g[i][j]);
                }
            }
        }
    }

    private static int dfs(int x, int y, int Node) {
        //방문 체크
        visited[Node] = true;

        // 상하
        int[] dx = {-1, 1, 0, 0};
        // 좌우
        int[] dy = {0, 0, -1, 1};

        // 4방 탐색하며 인접 노드 탐색
        for (int d = 0; d < 4; d++) {
            int nx = x + dx[d];
            int ny = y + dy[d];

            if (nx < 0 || ny < 0) {
                continue;
            }
            // 연결 노드 방문했으면 종료
            if (!visited[g[nx][ny]]) {
                continue;
            }

            System.out.println(nx + " " + ny);
            System.out.println("연결 노드: " + g[nx][ny]);

            int new_Node = g[nx][ny];
            visited[new_Node] = true;
            dfs(nx, ny, new_Node);


        }
        return count;
    }
}

//                System.out.println(nx + " " + ny);
//                System.out.println("연결 노드: " + g[nx][ny]);

/**
 * 배추가 심어져있는 곳만 인접 행렬에 할당해주어야 함
 * 노드의 시작점을 따로 지정해주지 안았으므로, 찾아내고 시작 노드를 설정해야 한다
 * 메인 메소드에서 graph를 탐색하며 1이 발견되면, 해당 노드를 기준으로 dfs를 호출한다
 */
