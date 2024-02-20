package baek_joon.n1912;

import java.util.Scanner;

public class Main {

    //배열
    static int[] arr;
    // 최댓값 저장할 dp 배열
    static Integer[] dp;
    //최대값 변수
    static int max;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력받을 정수
        int n = sc.nextInt();

        // 값 입력받을 배열 초기화
        arr = new int[n];
        dp = new Integer[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // dp[0]은 첫 번째 원소의 값으로 초기화
        dp[0] = arr[0];
        // 최대값 초기화
        max = arr[0];

        recur(n - 1);

        System.out.println(max);
    }

    static int recur(int n) {

        if (dp[n] == null) {
            // arr[n]+dp[n-1]과, arr[n] 값을 더한 값 중 최대값을 선택
            dp[n] = Math.max(recur(n - 1) + arr[n], arr[n]);
            max = Math.max(dp[n], max);
        }
        return dp[n];
    }
}
