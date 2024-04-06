package baek_joon.class_2.부녀회장이될테야;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.BatchUpdateException;

public class Main3 {
    static int n, k;
    static int[][] arr;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int tc = 0;
        tc = Integer.parseInt(br.readLine());


        //각 층의 1호에는 무조건 1명
        //dp 바텀업이기에 0층 1호  -  n 호까지 사람 채운다
        for (int i = 0; i < tc; i++) {
            //층
            n = Integer.parseInt(br.readLine());
            //호
            k = Integer.parseInt(br.readLine());

            arr = new int[n + 1][k + 1];


            for (int j = 0; j < arr.length; j++) {
                arr[j][0] = 1;
            }
            for (int p = 0; p < k; p++) {
                arr[0][p] = p + 1;
            }
            //DP 테이블 기반으로 사람 채운다
            for (int p = 1; p < arr.length; p++) {
                for (int q = 1; q < arr[p].length; q++) {
                    arr[p][q] = arr[p][q - 1] + arr[p - 1][q];
                }
            }
            sb.append(arr[n][k - 1]).append("\n");
            //배열 초기화해줘야 한다
        }
        System.out.print(sb.toString().trim());

    }
}
