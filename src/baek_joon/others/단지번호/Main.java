package baek_joon.others.단지번호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class Main {
    static int[][] hMap;
    static int[][] visitied;
    static int[][] der = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    static int count;

    //dfs메소드
    public static void dfs(int[][] hMap, int[][] visitied) {
        count = 1;
        for (int i = 0; i < hMap.length; i++) {
            for (int j = 0; j < hMap.length; j++) {
                if (hMap[i][j] == 1 && visitied[i][j] == 0) {
                    dfs_recur(i, j, visitied);
                    count++;
                }
            }
        }
    }

    //dfs 내에서 재귀호출, 스택 구현, 연결 여부를 확인하고 Visit 체크
    public static void dfs_recur(int x, int y, int[][] visitied) {

        int size = 1;
        Stack<int[]> stack = new Stack<>();
        int[] arr = {x, y};
        stack.push(arr);

        visitied[x][y] = count;

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());
        hMap = new int[size][size];

//        for (int i = 0; i < size; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            for (int j = 0; j < size; j++) {
//                hMap[i][j] = Integer.parseInt(st.nextToken());
//            }
//        }

        for (int i = 0; i < size; i++) {
            hMap[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        System.out.println(Arrays.toString(hMap));

        dfs(hMap, visitied);

    }
}
