package baek_joon.class_3.미로탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Subject Graph
 *
 * 인접 행렬, 인접 리스트 어떤 것 사용할지
 * 최단경로로 가야함 -> 예지 4 노드 어떤 것 선택해야 하는지
 * 인접 노드 여러 개 일 때 어떤 게 최단경로일지 모르는데 이거 어떻게 할건지
 * 일단 다 가본다
 *
 * @Point
 * BFS를 사용해야 했음
 */
public class Main {
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

        //NxM의 크기 배열 표현 미로
        //1,1에서 출발하여 N,M의 위치로 이동할 때 지나야 하는 최소 칸 수 -> 최소 경로 -> 미로까지 가기에 최소 경로

        //N,M 입력 받기
        String[] nm = br.readLine().split(" ");
        n = Integer.parseInt(nm[0]);
        m = Integer.parseInt(nm[1]);

        //Graph 가로 길이 M, 세로 길이 N
        //인접 행렬 할당
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

        //시작노드 1,1 dfs 호출
        dfs(0, 0);
        System.out.println(count);
        dfs2(0, 0);
        //방문하지 않았다면
    }

    //DFS 호출
    // x,y 좌표로 방문 체크
    //4방탐색 델타 배열
    //4방 탐색 시작
    //4방탐색 배열 범위조건 새로운 좌표 <0이고, nx > n이고 ny>m이면 continue
    //만약 4방 탐색 인접 배열이 1이고, 방문 하지 않았 다면 dfs 재귀 호출
    //지나야하는 최소 칸 수 ??

    private static void dfs(int x, int y) {
        visit[x][y] = true;

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, 1, -1};

        for (int d = 0; d < 4; d++) {
            int nx = x + dx[d];
            int ny = y + dy[d];

            if (nx < 0 || ny < 0 || nx >= n || ny >= m) {
                continue;
            }

            if (g[nx][ny] == 1 && !visit[nx][ny]) {
                count++;
                dfs(nx, ny);
            }
        }
    }

    private static void dfs2(int x, int y) {
        // 스택 할당
        // 시작노드 push
        // 스택 빌 때까지

    }

}
