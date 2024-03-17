package baek_joon.class_3.미로탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


/***
 * @Point

 * 인접노드 여러개일 때 한 개의 최단경로
 * bfs가 최단거리를 보장하는 원리 생각해보기
 */
public class Main2 {
    //방문 배열
    static boolean[][] visit;
    //인접 행렬 배열
    static int[][] g;
    //노드 탐색 카운트 int
    static int count;
    //세로,가로 길이
    static int n, m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //N,M 입력 받기
        String[] nm = br.readLine().split(" ");
        n = Integer.parseInt(nm[0]);
        m = Integer.parseInt(nm[1]);

        //인접행렬 메모리 할당
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
        //출력
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(g[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(bfs(0, 0));

    }

    private static int bfs(int x, int y) {
        //델타 배열
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        //큐 할당
        Queue<Point> q = new LinkedList<>();

        //큐 시작 위치, 거리 삽입
        q.add(new Point(0, 0, 0));

        //방문 체크
        visit[0][0] = true;

        while (!q.isEmpty()) {
            Point now = q.poll();

            int nowX = now.getX();
            int nowY = now.getY();
            int dis = now.getDis();
            if (nowX == n - 1 && nowY == m - 1) {
                return dis;
            }

            for (int d = 0; d < 4; d++) {
                int newX = nowX + dx[d];
                int newY = nowY + dy[d];

                if (newX < 0 || newY < 0 || newX >= n || newY >= m) {
                    continue;
                }
                // 인접 노드 1이고, 방문하지 않았다면 방문체크 큐 삽입 거리 +1 갱신
                if (g[newX][newY] == 1 && !visit[newX][newY]) {
                    visit[newX][newY] = true;
                    q.add(new Point(newX, newY, dis + 1));
                }
            }
        }

        //큐 빌 때 까지 반복
//        while (!que.isEmpty()) {
//            int[] nowNode = que.poll();
//            int curX = nowNode[0];
//            int curY = nowNode[1];
//            for (int d = 0; d < 4; d++) {
//                int nx = curX + dx[d];
//                int ny = curY + dy[d];
//                if (nx < 0 || ny < 0 || nx >= n || ny >= m) {
//                    continue;
//                }
//                //4방 탐색 인접 노드 찾기
//                //인접한 노드의 거리가 -1 이라면 아직 방문하지 않았다
//                //인접한 노드의 거리를 현재 노드 + 1 로 갱신해주어야 한다
//                //현재 경로 정점을 인접 노드로 갱신
//                //인접노드 큐 add
//                if (g[nx][ny] == 1 && !visit[nx][ny]) {
//                    count++;
//                    visit[nx][ny] = true;
//                    que.add(new int[]{nx, ny});
//                }
//            }
//        }
        return -1;
    }

    //데이터 쌍 저장할 Pair 클래스
    public static class Point {
        private final int x, y, dis;

        public Point(int x, int y, int dis) {
            this.x = x;
            this.y = y;
            this.dis = dis;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public int getDis() {
            return dis;
        }
    }
}
// 인접 노드 여러 개 일 때 한 꺼번에 큐에 삽입?
// 인접행렬이 아니라 인접된 노드를 for 돌려야 하는건지 그럼 4방 탐색은 어떻게 할건지
// (0, 3) -> (0,4) 탐색못하고 continue됨 = nx,ny 길이
// bfS 종료 시점 언제
// 거리 출력 void -> int, 리턴값