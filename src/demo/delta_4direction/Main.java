package demo.delta_4direction;

/**
 * @Subject 델타 4방 탐색
 */
public class Main {
    //좌우 이동
    // 상하
    static int[] dx = {-1, 1, 0, 0};
    // 좌우
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        int N = 4;
        int[][] map = {{1, 2, 3, 4},
                {5, -1, 7, 8},
                {9, 10, 11, 12},
                {13, 14, -1, 16}};

        for (int x = 0; x < 4; x++) {
            for (int y = 0; y < 4; y++) {
                if (map[x][y] == -1) {

                    // target이 -1이라면 4방 탐색을 수행함
                    for (int d = 0; d < 4; d++) {
                        //현재 위치에서 상하좌우로 이동한 좌표 계산
                        int nx = x + dx[d];
                        int ny = y + dy[d];

                        if (ny < 0 || ny >= N || nx < 0 || nx >= N) {
                            continue; // 범위 벗어나면 다음 방향 진행
                        }
//                        System.out.println("x + dx[d] : " + x + " , " + dx[d]);
//                        System.out.println("y + dy[d] : " + y + " , " + dy[d]);
//                        System.out.println("nx: " + nx + " / ny: " + ny);
                        System.out.println("탐색결과: " + map[nx][ny] + " ");
                        System.out.println();
                    }
                }
            }
        }
    }
}
