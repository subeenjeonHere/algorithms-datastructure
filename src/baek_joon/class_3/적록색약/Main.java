package baek_joon.class_3.적록색약;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.SortedMap;
import java.util.Stack;


/**
 * @Point 어떤 알고리즘 사용 - DFS, 인접행렬
 * 방문 체크 - 좌표 저장해야 함 - point 클래스
 * 시작 노드 - 0,0으로 불러서 r만 호출됨
 */
public class Main {

    //델타탐색
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    //n
    static int n;
    //n*n 인접행렬
    static String[][] g;
    //방문배열
    static boolean[][] visit;
    //카운트 변수 n0, n1
    static int n0, n1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //n입력
        n = Integer.parseInt(br.readLine());
        //인접행렬 생성 방문배열 할당
        g = new String[n + 1][n + 1];

        String[] info = new String[n];
        for (int i = 0; i < n; i++) {
            info = br.readLine().split("");
            for (int j = 0; j < n; j++) {
                g[i][j] = info[j];
            }
        }

        int n0 = 0;
        int n1 = 0;
        int[] res = new int[2];
        //dfs 콜
        //개수 초기화 됨
        for (int i = 0; i < 2; i++) {
            visit = new boolean[n + 1][n + 1];

            for (int x = 0; x < g.length - 1; x++) {
                for (int y = 0; y < g[x].length - 1; y++) {
                    if (!visit[x][y]) {

                        dfs(x, y, i);
                        if (i == 0) {
                            n0++;
                        } else if (i == 1) {
                            n1++;
                        }
                    }
                }
            }
        }

        System.out.print(n0 + " " + n1);
    }

    //dfs
    private static void dfs(int x, int y, int i) {

        Stack<Point> stk = new Stack<>();
        stk.push(new Point(x, y));
        visit[x][y] = true;

        while (!stk.isEmpty()) {
            Point now = stk.pop();

            int nX = now.getX();
            int nY = now.getY();

            String a = g[nX][nY];

            for (int d = 0; d < 4; d++) {
                int newX = nX + dx[d];
                int newY = nY + dy[d];

                if (newX < 0 || newY < 0 || newX >= n || newY >= n) {
                    continue;
                }

                //인접노드
                String newNode = g[newX][newY];
                //0번째 색약없을때
                if (i == 0) {
                    if (a.equals(newNode) && !visit[newX][newY]) {
                        visit[newX][newY] = true;
                        stk.push(new Point(newX, newY));
                    }
                }
                //1번째 색약잇을 떄 //r,g 똑같을 때 처리
                //현재노드가 r이라면, r,g 다 갈 수 있다.
                else if (i == 1) {
                    if (a.equals("R") && g[newX][newY].equals("G") && !visit[newX][newY]
                            ||
                            a.equals("R") && g[newX][newY].equals("R") && !visit[newX][newY]
                            ||
                            a.equals("G") && g[newX][newY].equals("R") && !visit[newX][newY]
                            ||
                            a.equals("G") && g[newX][newY].equals("G") && !visit[newX][newY]
                            ||
                            a.equals("B") && g[newX][newY].equals("B") && !visit[newX][newY]) {
                        visit[newX][newY] = true;
                        stk.push(new Point(newX, newY));
                    }
//                    if ((a.equals("R") && (g[newX][newY].equals("G") || g[newX][newY].equals("R")) && !visit[newX][newY]
//                            || a.equals("G") && (g[newX][newY].equals("R") || g[newX][newY].equals("G")) && !visit[newX][newY])
//                            || a.equals("B") && g[newX][newY].equals("B") && !visit[newX][newY]) {
//                        visit[newX][newY] = true;
//                        stk.push(new Point(newX, newY));
//                    }
                }
            }
        }
    }
//스택 선언
//시작 노드 삽입, 방문 체크
//for 0 - 2
//while 스택 비어있지않으면
//now = stk.peek
//4방탐색
// nX = now.getX, nY = now.getY
//첫번째 만약 4방탐색 결과 r,g,b
//now와 같으면 방문 체크 dfs call
//카운트 0일 때 n0, 1일때 n1

    //pair
    public static class Point {
        private final int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }
}
