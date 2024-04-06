package baek_joon.others.다리놓기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int tc;
    static int n, m;
    static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        tc = Integer.parseInt(br.readLine());

        for (int i = 0; i < tc; i++) {
            String[] nm = br.readLine().split(" ");
            n = Integer.parseInt(nm[0]);
            m = Integer.parseInt(nm[1]);


            //Dp 생성
            dp = new int[n + 1][m + 1];
            //N 1개일 때 초기화

            for (int j = 1; j <= m; j++) {
                dp[1][j] = j;
                for (int h = 1; h <= n; h++) {
                    dp[h][h] = 1;
                }
            }

            for (int p = 2; p < dp.length; p++) {
                for (int q = 3; q < dp[p].length; q++) {
                    dp[p][q] = dp[p][q - 1] + dp[p - 1][q - 1];
                }
            }
            sb.append(dp[n][m]).append("\n");
        }
        System.out.print(sb.toString().trim());


    }
}
