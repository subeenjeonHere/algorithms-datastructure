package baek_joon.class_3.토마토;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @Subject BFS
 * @Point .
 * BFS 한 레벨 탐색 +1일 최단거리.
 * BFS Depth 어떻게 구할건지
 */
public class Main {
    static int n, m;
    static int[][] g;
    //0개수
    static int zero;
    static int count;
    //델타
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    //방문
    static int[][] visit;

    public static void main(String[] args) throws IOException {
        //가로 M, N 미로 메모리 할당
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //n,m 입력
        String[] s = br.readLine().split(" ");
        m = Integer.parseInt(s[0]);
        n = Integer.parseInt(s[1]);
        g = new int[n][m];
        visit = new int[n][m];

        //0,1 토마토 인접 행렬 입력 받기
        for (int i = 0; i < n; i++) {
            String[] node = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                g[i][j] = Integer.parseInt(node[j]);
                //0 개수 저장
                if (g[i][j] == 0) {
                    zero += 1;
                }
            }
        }

        print();

        //시작부터 안익은 토마토없으면
        if (zero == 0) {
            System.out.println("0");
            return;
        }

        //1인 노드 찾아서 bfs 시작
        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (g[i][j] == 1) {
                    // 0변화 저장
                    res = bfs(i, j);
                }
            }
        }
        //토마토 다 안 익었으면 -1리턴
        if (res > 0) {
            System.out.println("-1");
        } else {
            System.out.println("결과: " + res);
        }
    }


    private static int bfs(int x, int y) {
        Queue<Pair> que = new LinkedList<>();
        Queue<int[]> q = new LinkedList<>();

        visit[x][y] = 1;

        que.add(new Pair(x, y, 0));
        q.offer(new int[]{x, y});

        while (!q.isEmpty()) {
            //큐에서 폴
            int[] now = q.poll();
            //4방 탐색

            for (int d = 0; d < 4; d++) {
                int nX = now[0] + dx[d];
                int nY = now[1] + dy[d];

                if (nX < 0 || nY < 0 || nX >= 0 || nY >= 0) {
                    continue;
                }

                if (g[nX][nY] == 1 && g[nX][nY] == -1) {
                    continue;
                }
                if (g[nX][nY] == 0 && visit[nX][nY] == 0) {
                    visit[nX][nY] = 1;
                    g[nX][nY] = g[now[0]][now[1]] + 1;
                    q.add(new int[]{nX, nY});
                }

            }
        }

//        while (!que.isEmpty()) {
//            Pair now = que.poll();
//            int nx = now.getX();
//            int ny = now.getY();
//            int nDis = now.getDis();
//            for (int d = 0; d < 4; d++) {
//
//                int newX = nx + dx[d];
//                int newY = ny + dy[d];
//
//                if (newX < 0 || newY < 0 || newX >= n || newY >= m) {
//                    continue;
//                }
//                if (g[newX][newY] == 1 && g[newX][newY] == -1) {
//                    continue;
//                }
//
//                if (g[newX][newY] == 0 && visit[newX][newY] == 0) {
//                    visit[newX][newY] = 1;
//                    zero += -1;
//                    que.add(new Pair(newX, newY, nDis + 1));
//                    System.out.println("0: " + zero);
//                }
//            }
//        }

        return -1;
    }

    //큐 메모리 할당
    //방문 배열 = 0미방문 1방문 . 1로 변경
    // 노드 방문 1로 변경
    //큐 시작노듯 삽입
    //큐가 빌 때까지 4방 탐색 시작
    //for loop 4방 탐색
    //if -1 이거나, 1이면 continue
    //4방 탐색 인접 노드 0이고, 방문 안 했으면 큐 삽입
    //0이 1로 변경됨 -. 0 개수 감소
    public static class Pair {
        private final int x, y, dis;

        public Pair(int x, int y, int dis) {
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

    private static void print() {
        for (int i = 0; i < g.length; i++) {
            for (int j = 0; j < g[i].length; j++) {
                System.out.print(g[i][j] + " ");
            }
            System.out.println();
        }
    }
}

// 상하좌우 토만토만 영향
// 모든 정점을 탐색할 때 까지, 몇 개의 레벨을 거쳐야?(일수)
// 인접 노드 한 레벨 탐색할 떄마다 + 1일 최단거리
// 모든 레벨 탐색 했는데, 0 개수가 1이 상이다 = 갈 수 없었던 곳에 0이 있었다. = -1 출력

