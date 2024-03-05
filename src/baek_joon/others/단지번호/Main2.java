package baek_joon.others.단지번호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

class Main2 {

    final static int max = 25;

    static int[][] graph;
    static Boolean[][] visited;

    static int[] dix = new int[]{-1, 1, 0, 0};
    static int[] diy = new int[]{0, 0, 1, -1};

    static int countPer;

    private static void dfs(int i, int j) {
        visited[i][j] = true;
        countPer++;


    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        //graph, visited 초기화
        graph = new int[max][max];
        visited = new Boolean[max][max];

        // graph에 0,1을 저장
        // ref. j는 1부터 N까지 순회 -> j-1부터 저장
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            String num = br.readLine();
            for (int j = 1; j <= n; j++)
                graph[i][j] = Integer.parseInt(String.valueOf(num.charAt(j - 1)));
        }

        // (1,1)부터 (N,N)까지 돌면서 dfs
        // ref. 각 단지가 몇 개의 아파트로 구성되어있는지
        ArrayList<Integer> countList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                //graph에 1이 있고, visit한 적 없다면
                if (graph[i][j] == 1 && !visited[i][j]) {
                    // ref. 각 단지별로 몇 개의 아파트 존재하는지 세기 위함, 0으로 초기화하고 dfs 호출
                    countPer = 0;
                    dfs(i, j);
                    countList.add(countPer);
                }
            }
        }

        // 출력
        System.out.println(countList.size());
        Collections.sort(countList);
        for (int ele : countList) {
            System.out.println(ele);
        }
    }
}
/**
 * visited 배열 활용한 정석풀이
 */