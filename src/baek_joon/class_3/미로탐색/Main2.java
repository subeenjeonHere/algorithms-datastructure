package baek_joon.class_3.미로탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/***
 * @Point
 *
 * (0, 3) -> (0,4) 탐색못하고 continue됨 = nx,ny 길이
 * 인접노드 여러개일 때 한개의 최단경로를 찾아내야 함
 */
public class Main2 {
    //방문 배열
    static boolean[][] visit;
    //인접행렬 배열
    static int[][] g;
    //노드 탐색 카운트 int
    static int count;
    //세로,가로길이
    static int n, m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //N,M 입력 받기
        String[] nm = br.readLine().split(" ");
        n = Integer.parseInt(nm[0]);
        m = Integer.parseInt(nm[1]);

        g = new int[n][m];
        //방문 배열 할당
        visit = new boolean[n][m];

        //인접행렬 입력받기
        for (int i = 0; i < n; i++) {
            String[] node = br.readLine().split("");
            for (int j = 0; j < m; j++) {
                g[i][j] = Integer.parseInt(node[j]);
            }
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(g[i][j] + " ");
            }
            System.out.println();
        }
        bfs(0, 0);
        System.out.println(count);
    }

    private static void bfs(int x, int y) {
        //델타배열
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        //bfs 큐로 구현
        //큐 좌표 저장
        //큐 자료구조 할당
        Queue<int[]> que = new LinkedList<>();
        //큐에 시작노드 삽입
        que.add(new int[]{x, y});
        //방문 체크
        visit[x][y] = true;
        //큐 빌 때 까지 반복
        while (!que.isEmpty()) {
            int[] nowNode = que.poll();
            int curX = nowNode[0];
            int curY = nowNode[1];
            for (int d = 0; d < 4; d++) {
                int nx = curX + dx[d];
                int ny = curY + dy[d];


                if (nx < 0 || ny < 0 || nx >= n || ny >= m) {
                    continue;
                }
                if (g[nx][ny] == 1 && !visit[nx][ny]) {
                    count++;
                    visit[nx][ny] = true;
                    que.add(new int[]{nx, ny});
                }
            }
        }
        //큐에서 poll (제일 먼저 들어온 노드)
        //4방 탐색
        //큐랑 인접노드이고 방문하지 않았다면
        //큐에 인접노드 삽입
        //방문 체크

    }
}
// 인접노드 여러 개 일 때 한 꺼번에 큐에 삽입?
// 이걸로 어떻게 최단경로를 구할 수 있는건지
