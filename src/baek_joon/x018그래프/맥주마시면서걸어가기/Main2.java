package baek_joon.x018그래프.맥주마시면서걸어가기;

import java.util.Scanner;

public class Main2 {
    static int n;
    static boolean check;
    static int px, py;

    static int[][] home;
    static int[][] map;
    static boolean[] visited;

    static void dfs(int px, int py) {
        // 각 좌표 거리가 1000m 이상인지
        int dis = Math.abs(map[px][0] - map[n + 1][0]) + Math.abs(map[px][1] - map[n + 1][1]);

        if (1000 <= dis) {
            check = true;
        }
        if (px == n) {
            return;
        }
        if (check) {
            return;
        }


        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                continue;
            }
            dis = Math.abs(map[px][0] - map[i + 1][0]) + Math.abs(map[px][1] - map[i + 1][1]);

            if (dis > 1000) {
                continue;
            }
            visited[i] = true;
            dfs(px + 1, i + 1);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //테스트 케이스
        int tc = sc.nextInt();

        for (int start = 1; start <= tc; start++) {


            //편의점 개수
            n = sc.nextInt();
            check = false;

            //좌표, 방문 여부
            map = new int[n + 2][n];
            visited = new boolean[n + 2];

            //좌표 저장
            for (int i = 0; i < n + 2; i++) {
                map[i][0] = sc.nextInt();
                map[i][1] = sc.nextInt();
            }
            dfs(0, 0);

            if (check) System.out.println("happy");
            else System.out.println("sad");
        }

    }
}
